//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Hashtable;

public final class GlomoDistributor extends GlomoOptionStorage {
    public Hashtable distPropertiesDescription = new Hashtable(4);

    public GlomoDistributor() {
        String[] cfgProperties = new String[]{
                "", "DistID", "SubDistID", "DistName", "DistWWW", "DistWWWTitle", "DistMoreGamesLink",
                "DistMoreGamesTitle", "DistLetter", "DistFlags", "RegisterSizeKey", "BonusSizeKey",
                "RegisterSizeKeyType1", "RegisterSizeKeyType2", "RegisterSizeKeyType3", "RegisterSizeKeyType4",
                "TailSeparator", "SmsKeyVersion"
        };
        String[] jadProperties = GlomoConfigLoader.splitString(
                ",",
                ",id,chId,name,glink,glinkTtl,mglink,mglinkTtl,pflag,gflag,kszReg,kszBns,kszSub1," +
                     "kszSub2,kszSub3,kszSub4,tailSepar,smsKeyVer"
        );
        this.distPropertiesDescription.put("CFG_1", cfgProperties);
        this.distPropertiesDescription.put("JAD_1", jadProperties);
        this.distPropertiesDescription.put("CFG_2", cfgProperties);
        this.distPropertiesDescription.put("JAD_2", jadProperties);
        this.setDistID("0001");
        this.setSubDistID("00");
        this.setDistName("GlowingMobile");
        this.setDistWWW("www.glowingmobile.com");
        this.setDistWWWTitle("Game link title");
        this.setDistMoreGamesLink("www.glomogames.com");
        this.setDistMoreGamesTitle("More games");
        this.setDistLetter("A");
        this.setDistFlags("FLAG");
        this.setRegisterSizeKey("6");
        this.setBonusSizeKey("4");
        this.setRegisterSizeKeyType1("6");
        this.setRegisterSizeKeyType2("6");
        this.setRegisterSizeKeyType3("6");
        this.setRegisterSizeKeyType4("6");
        this.setTailSeparator("#");
        this.setSmsKeyVersion("0");
    }

    // =====================  Getters  =====================

    public final String getDistID() {
        return this.getOption("DistID");
    }

    public final String getSubDistID() {
        String subDistID;
        for(subDistID = this.getOption("SubDistID"); subDistID.length() < (GlomoConfigManager.getConfigVersionInt() > 1 ? 5 : 2); subDistID = "0" + subDistID) {
        }

        return subDistID;
    }

    public final String getDistMoreGamesLink() {
        return this.getOption("DistMoreGamesLink");
    }

    public final String getRegisterSizeKey() {
        return this.getOption("RegisterSizeKey");
    }

    public final String getTailSeparator() {
        return this.getOption("TailSeparator");
    }

    public final String getSmsKeyVersion() {
        return this.getOption("SmsKeyVersion");
    }

    // =====================  Setters  =====================

    private String setDistID(String var1) {
        return this.putOption("DistID", var1);
    }

    private String setSubDistID(String id) {
        return this.putOption("SubDistID", id);
    }

    private String setDistName(String name) {
        return this.putOption("DistName", name);
    }

    private String setDistWWWTitle(String title) {
        return this.putOption("DistWWWTitle", title);
    }

    private String setDistWWW(String link) {
        return this.putOption("DistWWW", link);
    }

    private String setDistMoreGamesLink(String link) {
        return this.putOption("DistMoreGamesLink", link);
    }

    private String setDistMoreGamesTitle(String title) {
        return this.putOption("DistMoreGamesTitle", title);
    }

    private String setDistLetter(String letter) {
        return this.putOption("DistLetter", letter);
    }

    private String setDistFlags(String flags) {
        return this.putOption("DistFlags", flags);
    }

    private String setRegisterSizeKey(String size) {
        return this.putOption("RegisterSizeKey", size);
    }

    private String setBonusSizeKey(String size) {
        return this.putOption("BonusSizeKey", size);
    }

    private String setRegisterSizeKeyType1(String size) {
        return this.putOption("RegisterSizeKeyType1", size);
    }

    private String setRegisterSizeKeyType2(String size) {
        return this.putOption("RegisterSizeKeyType2", size);
    }

    private String setRegisterSizeKeyType3(String size) {
        return this.putOption("RegisterSizeKeyType3", size);
    }

    private String setRegisterSizeKeyType4(String size) {
        return this.putOption("RegisterSizeKeyType4", size);
    }

    private String setTailSeparator(String sep) {
        return this.putOption("TailSeparator", sep);
    }

    private String setSmsKeyVersion(String version) {
        return this.putOption("SmsKeyVersion", version);
    }

    private void setDistProperties(String[] properties) {
        this.readDistPropertiesFromAppEnv(properties);
        this.putOptions((String[])this.distPropertiesDescription.get("CFG_" + GlomoConfigManager.getConfigVersion()), properties);
    }

    private String[] readDistPropertiesFromAppEnv(String[] properties) {
        String[] jadProperties = (String[])this.distPropertiesDescription.get("JAD_" + GlomoConfigManager.getConfigVersion());

        for(int i = 0; i < jadProperties.length; ++i) {
            if (i < properties.length && jadProperties[i].compareTo("") != 0 &&
                this.getMidletProperty("dst_" + jadProperties[i]).compareTo("") != 0
            ) {
                properties[i] = this.getMidletProperty("dst_" + jadProperties[i]);
            }
        }

        return properties;
    }

    public final void setDistPropertiesFromConfig(String[] var1) {
        this.setDistPropertiesFromConfigStrings(var1, 0, 1);
    }

    private void setDistPropertiesFromConfigStrings(String[] config, int strIdxFrom, int strIdxTo) {
        for(int i = strIdxFrom; i < strIdxTo && i < config.length; ++i) {
            String[] stringTokens;
            if ((stringTokens = GlomoConfigLoader.splitString(";", config[i])).length > 1) {
                this.setDistProperties(stringTokens);
            }
        }

    }
}
