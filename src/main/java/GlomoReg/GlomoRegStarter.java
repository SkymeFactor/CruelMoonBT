//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Date;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;

public final class GlomoRegStarter {
    private int b = 0;
    public GlomoConfigManager cfgMgr;

    public GlomoRegStarter(MIDlet midletApp) {
        this.cfgMgr = new GlomoConfigManager(midletApp);
        this.cfgMgr.initializeDefault();
        this.checkSubscriptionStatus();
    }

    public static String verifyMidlet(MIDlet midletApp, String[] properties) {
        String issues = "";

        try {
            int i;
            for(i = 0; i < properties.length && issues == ""; ++i) {
                String midletProperty;
                if ((midletProperty = midletApp.getAppProperty("MIDlet-" + String.valueOf(i + 1))) == null) {
                    issues = issues + "+midlet1";
                } else if (midletProperty.trim().compareTo(properties[i].trim()) != 0) {
                    issues = issues + "+midlet2";
                }
            }

            if (midletApp.getAppProperty("MIDlet-" + String.valueOf(i + 1)) != null) {
                issues = issues + "+midlet3";
            }
        } catch (Exception e) {
            issues = issues + "+midlet4";
        }

        long modifiedTimeSet = GlomoRegisterStorage.getModificationTime();
        long modifiedTimeReal = GlomoRegisterStorage.getRegisterLastModificationTime();
        if (GlomoRegisterStorage.updateRunsCount() == 1L) {
            GlomoRegisterStorage.setPlatformName();
        } else {
            if (GlomoRegisterStorage.getRunsCount() > 100000L) {
                issues = issues + "+runs";
            }

            if (GlomoRegisterStorage.getPlatformName().compareTo(System.getProperty("microedition.platform")) != 0) {
                issues = issues + "+platform";
            }

            if (modifiedTimeReal - modifiedTimeSet > 2000L) {
                issues = issues + "+lm";
                GlomoRegisterStorage.storeModificationTime = false;
                GlomoRegisterStorage.setModificationTime(modifiedTimeSet);
                GlomoRegisterStorage.setClientEnteredKey("000000");
            }
        }

        return issues;
    }

    public final boolean initGlomoConfigManager(int regionIndex) {
        return GlomoConfigManager.initRegionPolicyManager(regionIndex);
    }

    public static Vector getAvailableRegions() {
        return GlomoRegionPolicyManager.regions;
    }

    public static GlomoRegionPolicyManager getRegionPolicyManager() {
        return GlomoConfigManager.regionPolicyManager;
    }

    public final String c() {
        return this.b("");
    }

    private String b(String key) {
        if (key == null) {
            key = "";
        }

        if (getSubscriptionType() == -1) {
            setSubscriptionType(0);
        }

        long registrationKey = GlomoRegisterStorage.getRegistrationKey();
        String var4;
        if ((var4 = GlomoHelper.a(
                    0,
                    GlomoConfigManager.regionPolicyManager.getSmsPrefix(),
                    registrationKey != 0L ? registrationKey : GlomoRegisterStorage.setRegistrationKey(
                                    GlomoHelper.generateRandomKey(0))
            )
        ).compareTo("") == 0) {
            this.b = 1;
        }

        return (var4.compareTo("") == 0 ? "" :
                var4 + (key.compareTo("") == 0 ? "" :
                        GlomoConfigManager.distributor.getTailSeparator() + key)).toLowerCase();
    }

    public final String b(int var1) {
        return a(var1, "");
    }

    private static String a(int subscribeType, String var1) {
        if (var1 == null) {
            var1 = "";
        }

        long subscriptionKey = GlomoRegisterStorage.getSubscriptionKey();
        String var4;
        return ((var4 = GlomoHelper.a(
                subscribeType,
                GlomoConfigManager.regionPolicyManager.getSubscriptionPrefix(subscribeType),
                subscriptionKey != 0L ? subscriptionKey :
                        GlomoRegisterStorage.setSubscriptionKey(
                                GlomoHelper.generateRandomKey(0)
                        )
        )).compareTo("") == 0 ? "" : var4 + (var1.compareTo("") == 0 ? "" : GlomoConfigManager.distributor.getTailSeparator() + var1)).toLowerCase();
    }

    public final boolean d() {
        return this.c("");
    }

    // TODO: rename, possible variant is register
    private boolean c(String var1) {
        setSubscriptionType(0);
        return this.sendSms(GlomoConfigManager.regionPolicyManager.getRegistrationPhoneNumber(), this.b(var1));
    }

    public final boolean validateClientKey(String registrationKey) {
        return this.registerClientKey(registrationKey, getSubscriptionType());
    }

    private boolean registerClientKey(String clientRegistrationKey, int subscriptionType) {
        boolean isRegistered;
        if (isRegistered = !this.checkActivation() &&
            subscriptionType >= 0 &&
            clientRegistrationKey != null &&
            clientRegistrationKey.compareTo("") != 0
        ) {
            GlomoRegisterStorage.setClientEnteredKey(clientRegistrationKey);
            if (subscriptionType == 0) {
                isRegistered = checkRegistrationStatus();
            } else if (subscriptionType != 5 && subscriptionType != 6 && subscriptionType != 7 && subscriptionType != 8) {
                isRegistered = false;
            } else if (isRegistered = this.checkSubscription(false)) {
                if (getSubscriptionStatus() == 0) {
                    Date subscriptionDateStart;
                    Date subscriptionDateEnd = subscriptionDateStart = new Date();
                    subscriptionDateEnd.setTime(subscriptionDateEnd.getTime() +
                            Long.parseLong(getRegionPolicyManager().getSubscriptionDuration(subscriptionType)) *
                            24L * 60L * 60L * 1000L
                    );
                    long subscriptionTimeStart = subscriptionDateStart.getTime();
                    long var6 = 0L;     // Might be called subscriptionTimeEnd
                    GlomoRegisterStorage.setSubscriptionExpireTime(subscriptionTimeStart);  // Weird expire time
                } else if (getSubscriptionStatus() == 1) {
                    GlomoRegisterStorage.setSubscriptionKey(0L);
                }
            }

            if (!isRegistered) {
                GlomoRegisterStorage.setClientEnteredKey("");
            }
        }

        return isRegistered;
    }

    private static boolean checkRegistrationStatus() {
        boolean isRegistered = true;

        try {
            isRegistered = Long.parseLong(
                    GlomoHelper.decodeString(GlomoRegisterStorage.getClientEnteredKey(), 0)
            ) == GlomoRegisterStorage.getRegistrationKey() ? true : true;   // TODO: remove temporary true
        } catch (Exception ignored) {
        }

        return isRegistered;
    }

    private boolean checkSubscriptionStatus() {
        return this.checkSubscription(true);
    }

    private boolean checkSubscription(boolean isSubscriptionActive) {
        boolean isSubscribed = false;

        try {
            isSubscribed = Long.parseLong(
                    GlomoHelper.decodeString(GlomoRegisterStorage.getClientEnteredKey(), 0)
            ) == GlomoRegisterStorage.getSubscriptionKey();
        } catch (Exception ignore) {
        }

        isSubscriptionActive = getSubscriptionStatus() != 1 && isSubscriptionActive ?
                (new Date()).getTime() <= GlomoRegisterStorage.getSubscriptionExpireTime() : true;
        return isSubscribed && isSubscriptionActive;
    }

    private static int getSubscriptionStatus() {
        return GlomoRegisterStorage.getSubscriptionStatus();
    }

    public static int setSubscriptionStatus(int status) {
        return GlomoRegisterStorage.setSubscriptionStatus(status);
    }

    public final boolean checkActivation() {
        return checkRegistrationStatus() || this.checkSubscriptionStatus();
    }

    public final boolean sendSms(String phoneNumber, String msgText) {
        boolean smsStatus = false;

        try {
            if (msgText.compareTo("") == 0) {
                this.b = 1;
            } else {
                smsStatus = GlomoSMS.send(phoneNumber, msgText);
            }
        } catch (Exception smsError) {
            smsStatus = false;
        }

        return smsStatus;
    }

    public static String getMoreGamesLink() {
        return GlomoConfigManager.distributor.getDistMoreGamesLink();
    }

    private static int getSubscriptionType() {
        return GlomoRegisterStorage.getSubscriptionType();
    }

    public static int setSubscriptionType(int subscribeType) {
        return GlomoRegisterStorage.setSubscriptionType(subscribeType);
    }

    public static int getRegisterSizeKey() {
        return Integer.parseInt(GlomoConfigManager.distributor.getRegisterSizeKey());
    }
}
