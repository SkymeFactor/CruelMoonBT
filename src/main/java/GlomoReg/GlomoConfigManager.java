//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import javax.microedition.midlet.MIDlet;

public final class GlomoConfigManager {
    private static String configVersion = "0";
    public static GlomoDistributor distributor = new GlomoDistributor();
    public static GlomoRegionPolicyManager regionPolicyManager = new GlomoRegionPolicyManager();
    private static MIDlet appHandler;
    private static String[] config;
    private static int configUsageCounter = 0;

    public GlomoConfigManager(MIDlet midletApp) {
        appHandler = midletApp;
        distributor.setMidletHandler(midletApp);
        regionPolicyManager.setMidletHandler(midletApp);
    }

    public static String getConfigVersion() {
        return configVersion;
    }

    public static int getConfigVersionInt() {
        return Integer.parseInt(configVersion);
    }

    public static boolean checkConfigVersion(String version) {
        return version.compareTo(configVersion) == 0;
    }

    public static String getSmsKeyVersion() {
        return distributor.getSmsKeyVersion();
    }

    private static String[] getGlomoConfig() {
        if (config == null) {
            config = GlomoHelper.readGlomoConfigFile(appHandler, "/glomo.cfg");
            configUsageCounter = 0;
        }

        ++configUsageCounter;
        return config;
    }

    private static void releaseGlomoConfig() {
        if (config != null) {
            --configUsageCounter;
        }

        if (configUsageCounter == 0) {
            config = null;
            configUsageCounter = 0;
        }

    }

    public static boolean initRegionPolicyManager(int regionIndex) {
        if (regionIndex < 0) {
            return false;
        } else {
            GlomoRegionPolicyManager rpMgr = GlomoConfigManager.regionPolicyManager.getNewInstance(
                    getGlomoConfig(),
                    GlomoRegionPolicyManager.getRegionIdByIndex(regionIndex)
            );
            releaseGlomoConfig();
            GlomoRegisterStorage.setCurrentRegionIndex(rpMgr == null ? -1 : GlomoRegionPolicyManager.getRegionIndex(rpMgr.getId()));
            if (rpMgr != null) {
                GlomoConfigManager.regionPolicyManager = rpMgr;
            } else {
                GlomoConfigManager.regionPolicyManager.setId("-1");
            }

            return GlomoRegisterStorage.getCurrentRegionIndex() != -1;
        }
    }

    public final boolean initializeDefault() {
        return this.initWithRegionIndex(GlomoRegisterStorage.getCurrentRegionIndex());
    }

    private static String readCurrentConfigVersion() {
        configVersion = GlomoHelper.splitString(";", getGlomoConfig()[0])[0];
        releaseGlomoConfig();
        return configVersion;
    }

    private boolean initWithRegionIndex(int regionIndex) {
        String[] cfg = getGlomoConfig();
        readCurrentConfigVersion();
        distributor.setDistPropertiesFromConfig(cfg);
        if (regionPolicyManager.addRegions(cfg) <= regionIndex) {
            regionIndex = -1;
        }

        releaseGlomoConfig();
        return initRegionPolicyManager(regionIndex);
    }

    public static final boolean checkAppCountryPropertiesAreSet() {
        return GlomoHelper.getMidletPropertySafe(appHandler, "c_0_code").compareTo("") != 0 ||
               GlomoHelper.getMidletPropertySafe(appHandler, "c_0_name").compareTo("") != 0;
    }
}
