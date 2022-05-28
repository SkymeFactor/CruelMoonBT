//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Hashtable;
import java.util.Vector;

public final class GlomoRegionPolicyManager extends GlomoOptionStorage {
    public static final Vector regions = new Vector(0);
    // Mapping by region id
    public static final Hashtable regionsIndexById = new Hashtable(0);
    public static final Hashtable idByCountryName = new Hashtable(0);
    public static final Hashtable idByCountryCode = new Hashtable(0);
    public static final Hashtable configsDescription = new Hashtable(4);

    public GlomoRegionPolicyManager() {
        String[] config1 = new String[]{
                "name", "prefix", "numReg", "priceReg", "prefix_bonus1", "numBonus1", "priceBonus1", "prefix_spec",
                "numSpec", "priceSpec", "prefix_subscribe_type1", "numSubscribeType1", "priceSubscribeType1",
                "durationSubscribeType1", "prefix_subscribe_type2", "numSubscribeType2", "priceSubscribeType2",
                "durationSubscribeType2", "prefix_subscribe_type3", "numSubscribeType3", "priceSubscribeType3",
                "durationSubscribeType3", "prefix_subscribe_type4", "numSubscribeType4", "priceSubscribeType4",
                "durationSubscribeType4", "specParam1", "specParam2", "specParam3", "specParam4"
        };
        String jad1 = "name,pfxReg,snReg,priceReg,pfxBns1,snBns1,priceBns1,pfxSpec,snSpec,priceSpec,pfxSub1," +
                "snSub1,priceSub1,prmSub1,pfxSub2,snSub2,priceSub2,prmSub2,pfxSub3,snSub3,priceSub3,prmSub3," +
                "pfxSub4,snSub4,priceSub4,prmSub4,param1,param2,param3,param4";
        String[] config2 = new String[]{
                "name", "code", "prefix", "numReg", "priceReg", "paramReg", "prefix_bonus1", "numBonus1",
                "priceBonus1", "paramBonus1", "prefix_bonus2", "numBonus2", "priceBonus2", "paramBonus2",
                "prefix_bonus3", "numBonus3", "priceBonus3", "paramBonus3", "prefix_bonus4", "numBonus4",
                "priceBonus4", "paramBonus4", "prefix_subscribe_type1", "numSubscribeType1", "priceSubscribeType1",
                "durationSubscribeType1", "prefix_subscribe_type2", "numSubscribeType2", "priceSubscribeType2",
                "durationSubscribeType2", "prefix_subscribe_type3", "numSubscribeType3", "priceSubscribeType3",
                "durationSubscribeType3", "prefix_subscribe_type4", "numSubscribeType4", "priceSubscribeType4",
                "durationSubscribeType4", "prefix_spec", "numSpec", "priceSpec", "paramSpec", "specParam1",
                "specParam2", "specParam3", "specParam4"
        };
        String jad2 = "name,code,pfxReg,snReg,priceReg,prmReg,pfxBns1,snBns1,priceBns1,prmBns1,pfxBns2,snBns2," +
                "priceBns2,prmBns2,pfxBns3,snBns3,priceBns3,prmBns3,pfxBns4,snBns4,priceBns4,prmBns4,pfxSub1," +
                "snSub1,priceSub1,prmSub1,pfxSub2,snSub2,priceSub2,prmSub2,pfxSub3,snSub3,priceSub3,prmSub3," +
                "pfxSub4,snSub4,priceSub4,prmSub4,pfxSpec,snSpec,priceSpec,prmSpec,param1,param2,param3,param4";

        if (!configsDescription.contains("CFG_1")) {
            configsDescription.put("CFG_1", config1);
        }

        if (!configsDescription.contains("JAD_1")) {
            configsDescription.put("JAD_1", GlomoConfigLoader.splitString(",", jad1));
        }

        if (!configsDescription.contains("CFG_2")) {
            configsDescription.put("CFG_2", config2);
        }

        if (!configsDescription.contains("JAD_2")) {
            configsDescription.put("JAD_2", GlomoConfigLoader.splitString(",", jad2));
        }

        this.setId("-1");
        this.setCountryName("Russia");
        this.setCountryCode("");
        this.setSmsPrefix("BOMB");
        this.setRegistrationPhoneNumber("1132");
        this.setRegistrationPrice("94.00 RUR ex. VAT");
        this.setRegistrationParam("");

        this.setBonusSmsPrefix(1, (String)"BOMB");
        this.setBonusPhoneNumber(1, "1132");
        this.setBonusPrice(1, "7.50 RUR ex. VAT");
        this.setBonusParam(1, "");

        this.setSpecSmsPrefix("SPEC");
        this.setSpecPhoneNumber("1136");
        this.setSpecPrice("50 RUR ex.VAT");
        this.setSpecParam("");

        this.setSubscriptionPrefix(5, "SUB1");
        this.setSubscriptionPhoneNumber(5, "1133");
        this.setSubscriptionPrice(5, "5.00 RUR ex. VAT");
        this.setSubscriptionDuration(5, "1");

        this.setSubscriptionPrefix(6, "SUB2");
        this.setSubscriptionPhoneNumber(6, "1134");
        this.setSubscriptionPrice(6, "25.00 RUR ex. VAT");
        this.setSubscriptionDuration(6, "7");

        this.setSubscriptionPrefix(7, "SUB3");
        this.setSubscriptionPhoneNumber(7, "1135");
        this.setSubscriptionPrice(7, "50.00 RUR ex. VAT");
        this.setSubscriptionDuration(7, "14");

        this.setSubscriptionPrefix(8, "SUB4");
        this.setSubscriptionPhoneNumber(8, "1137");
        this.setSubscriptionPrice(8, "100.00 RUR ex. VAT");
        this.setSubscriptionDuration(8, "30");

        this.setSpecParam1("");
        this.setSpecParam2("");
        this.setSpecParam3("");
        this.setSpecParam4("");
    }

    // =====================  Getters  =====================

    public final int getId() {
        return this.getOptionInt("id");
    }

    private String getCountryName() {
        return this.getOption("name");
    }

    private String getCountryCode() {
        return this.getOption("code");
    }

    public final String getSmsPrefix() {
        return this.getOption("prefix");
    }

    public final String getSubscriptionPrefix(int subscribeType) {
        String prefixSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                prefixSubscribeType = "prefix_subscribe_type2";
                return this.getOption(prefixSubscribeType);
            }

            if (subscribeType == 7) {
                prefixSubscribeType = "prefix_subscribe_type3";
                return this.getOption(prefixSubscribeType);
            }

            if (subscribeType == 8) {
                prefixSubscribeType = "prefix_subscribe_type4";
                return this.getOption(prefixSubscribeType);
            }
        }

        prefixSubscribeType = "prefix_subscribe_type1";
        return this.getOption(prefixSubscribeType);
    }

    public final String getRegistrationPhoneNumber() {
        return this.getOption("numReg");
    }

    public final String getSubscriptionPhoneNumber(int subscribeType) {
        String numSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                numSubscribeType = "numSubscribeType2";
                return this.getOption(numSubscribeType);
            }

            if (subscribeType == 7) {
                numSubscribeType = "numSubscribeType3";
                return this.getOption(numSubscribeType);
            }

            if (subscribeType == 8) {
                numSubscribeType = "numSubscribeType4";
                return this.getOption(numSubscribeType);
            }
        }

        numSubscribeType = "numSubscribeType1";
        return this.getOption(numSubscribeType);
    }

    public final String getRegistrationPrice() {
        return this.getOption("priceReg");
    }

    public final String getSubscriptionPrice(int subscribeType) {
        String priceSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                priceSubscribeType = "priceSubscribeType2";
                return this.getOption(priceSubscribeType);
            }

            if (subscribeType == 7) {
                priceSubscribeType = "priceSubscribeType3";
                return this.getOption(priceSubscribeType);
            }

            if (subscribeType == 8) {
                priceSubscribeType = "priceSubscribeType4";
                return this.getOption(priceSubscribeType);
            }
        }

        priceSubscribeType = "priceSubscribeType1";
        return this.getOption(priceSubscribeType);
    }

    public final String getSubscriptionDuration(int subscribeType) {
        String durationSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                durationSubscribeType = "durationSubscribeType2";
                return this.getOption(durationSubscribeType);
            }

            if (subscribeType == 7) {
                durationSubscribeType = "durationSubscribeType3";
                return this.getOption(durationSubscribeType);
            }

            if (subscribeType == 8) {
                durationSubscribeType = "durationSubscribeType4";
                return this.getOption(durationSubscribeType);
            }
        }

        durationSubscribeType = "durationSubscribeType1";
        return this.getOption(durationSubscribeType);
    }

    // =====================  Setters  =====================

    public final String setId(String id) {
        return this.putOption("id", id);
    }

    private String setCountryName(String name) {
        return this.putOption("name", name);
    }

    private String setCountryCode(String code) {
        return this.putOption("code", code);
    }

    private String setSmsPrefix(String prefix) {
        return this.putOption("prefix", prefix);
    }

    private String setSpecSmsPrefix(String prefix) {
        return this.putOption("prefix_spec", prefix);
    }

    private String setBonusSmsPrefix(int subscribeType, String prefixBonus) {
        return this.putOption(!GlomoConfigManager.checkConfigVersion("1") && subscribeType != 1 ?
                (subscribeType == 2 ? "prefix_bonus2" :
                        (subscribeType == 3 ? "prefix_bonus3" :
                                (subscribeType == 4 ? "prefix_bonus4" : "prefix_bonus1"))) :
                "prefix_bonus1", prefixBonus);
    }

    private String setSubscriptionPrefix(int subscribeType, String prefix) {
        String prefixSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                prefixSubscribeType = "prefix_subscribe_type2";
                return this.putOption(prefixSubscribeType, prefix);
            }

            if (subscribeType == 7) {
                prefixSubscribeType = "prefix_subscribe_type3";
                return this.putOption(prefixSubscribeType, prefix);
            }

            if (subscribeType == 8) {
                prefixSubscribeType = "prefix_subscribe_type4";
                return this.putOption(prefixSubscribeType, prefix);
            }
        }

        prefixSubscribeType = "prefix_subscribe_type1";
        return this.putOption(prefixSubscribeType, prefix);
    }

    private String setRegistrationPhoneNumber(String number) {
        return this.putOption("numReg", number);
    }

    private String setBonusPhoneNumber(int bonus, String number) {
        return this.putOption(!GlomoConfigManager.checkConfigVersion("1") && bonus != 1 ?
                (bonus == 2 ? "numBonus2" :
                        (bonus == 3 ? "numBonus3" :
                                (bonus == 4 ? "numBonus4" : "numBonus1"))) :
                "numBonus1", number);
    }

    private String setSpecPhoneNumber(String number) {
        return this.putOption("numSpec", number);
    }

    private String setSubscriptionPhoneNumber(int subscribeType, String number) {
        String numSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                numSubscribeType = "numSubscribeType2";
                return this.putOption(numSubscribeType, number);
            }

            if (subscribeType == 7) {
                numSubscribeType = "numSubscribeType3";
                return this.putOption(numSubscribeType, number);
            }

            if (subscribeType == 8) {
                numSubscribeType = "numSubscribeType4";
                return this.putOption(numSubscribeType, number);
            }
        }

        numSubscribeType = "numSubscribeType1";
        return this.putOption(numSubscribeType, number);
    }

    private String setRegistrationPrice(String price) {
        return this.putOption("priceReg", price);
    }

    private String setBonusPrice(int bonus, String price) {
        return this.putOption(!GlomoConfigManager.checkConfigVersion("1") && bonus != 1 ?
                (bonus == 2 ? "priceBonus2" :
                        (bonus == 3 ? "priceBonus3" :
                                (bonus == 4 ? "priceBonus4" : "priceBonus1"))) :
                "priceBonus1", price);
    }

    private String setSpecPrice(String price) {
        return this.putOption("priceSpec", price);
    }

    private String setSubscriptionPrice(int subscribeType, String price) {
        String priceSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                priceSubscribeType = "priceSubscribeType2";
                return this.putOption(priceSubscribeType, price);
            }

            if (subscribeType == 7) {
                priceSubscribeType = "priceSubscribeType3";
                return this.putOption(priceSubscribeType, price);
            }

            if (subscribeType == 8) {
                priceSubscribeType = "priceSubscribeType4";
                return this.putOption(priceSubscribeType, price);
            }
        }

        priceSubscribeType = "priceSubscribeType1";
        return this.putOption(priceSubscribeType, price);
    }

    private String setSubscriptionDuration(int subscribeType, String duration) {
        String durationSubscribeType;
        if (subscribeType != 5) {
            if (subscribeType == 6) {
                durationSubscribeType = "durationSubscribeType2";
                return this.putOption(durationSubscribeType, duration);
            }

            if (subscribeType == 7) {
                durationSubscribeType = "durationSubscribeType3";
                return this.putOption(durationSubscribeType, duration);
            }

            if (subscribeType == 8) {
                durationSubscribeType = "durationSubscribeType4";
                return this.putOption(durationSubscribeType, duration);
            }
        }

        durationSubscribeType = "durationSubscribeType1";
        return this.putOption(durationSubscribeType, duration);
    }

    private String setRegistrationParam(String param) {
        return this.putOption("paramReg", param);
    }

    private String setBonusParam(int bonus, String param) {
        return this.putOption(!GlomoConfigManager.checkConfigVersion("1") && bonus != 1 ?
                (bonus == 2 ? "paramBonus2" :
                        (bonus == 3 ? "paramBonus3" :
                                (bonus == 4 ? "paramBonus4" : "paramBonus1"))) :
                "paramBonus1", param);
    }

    private String setSpecParam(String param) {
        return this.putOption("paramSpec", param);
    }

    private String setSpecParam1(String param) {
        return this.putOption("specParam1", param);
    }

    private String setSpecParam2(String param) {
        return this.putOption("specParam2", param);
    }

    private String setSpecParam3(String param) {
        return this.putOption("specParam3", param);
    }

    private String setSpecParam4(String param) {
        return this.putOption("specParam4", param);
    }

    private int copyRegionFromOther(GlomoRegionPolicyManager other, int parentId) {
        return createNewRegion(other.getId(), parentId, other.getCountryName(), other.getCountryCode());
    }

    private static int createNewRegion(int id, int parentId, String countryName, String countryCode) {
        int lastElementNumber = regions.size();
        regions.setSize(lastElementNumber + 1);
        regions.setElementAt(new GlomoRegion(id, countryName, countryCode), lastElementNumber);
        regionsIndexById.put(
                Integer.valueOf(GlomoConfigManager.checkAppCountryPropertiesAreSet() ? parentId : id),
                Integer.valueOf(lastElementNumber)
        );
        return lastElementNumber;
    }

    private static int performCountryMapping(int regionIndex) {
        if (regionIndex >= 0 && regionIndex < regions.size()) {
            GlomoRegion region = (GlomoRegion) regions.elementAt(regionIndex);
            idByCountryName.put(region.getCountryName(), Integer.valueOf(region.getId()));
            idByCountryCode.put(region.getCountryCode(), Integer.valueOf(region.getId()));
            return regionIndex;
        } else {
            return -1;
        }
    }

    private GlomoRegionPolicyManager setConfigProperties(int id, String[] properties) {
        this.setId(String.valueOf(id));
        this.putOptions((String[]) configsDescription.get("CFG_" + GlomoConfigManager.getConfigVersion()), properties);
        return this;
    }

    private int addRegionsWithAppCountryProperties(String[] configs) {
        this.addRegionsFromConfig(configs);
        clearRegions();

        String countryCode;
        String countryName;
        for(int i = 0; ((countryCode = this.getMidletProperty("c_" + String.valueOf(i) + "_code")) +
                        (countryName = this.getMidletProperty("c_" + String.valueOf(i) + "_name"))
        ).compareTo("") != 0; ++i) {
            int id = -1;
            GlomoRegionPolicyManager rpMgr;
            if (null != (rpMgr = this.getNewInstanceWithRegion(configs, countryName, countryCode))) {
                id = rpMgr.getId();
            }

            if (countryName.compareTo("") == 0) {
                countryName = rpMgr != null ? rpMgr.getCountryName() : countryCode;
            } else if (countryCode.compareTo("") == 0) {
                countryCode = rpMgr != null ? rpMgr.getCountryCode() : countryName;
            }

            ((GlomoRegion) regions.elementAt(createNewRegion(i, id, countryName, countryCode))).setParentId(id);
        }

        return regions.size();
    }

    private int addRegionsFromConfig(String[] configs) {
        GlomoRegionPolicyManager rpMgr = new GlomoRegionPolicyManager();
        clearRegions();
        clearCountriesMapping();

        for(int i = 1; i < configs.length; ++i) {
            String[] cfg = GlomoConfigLoader.splitString(";", configs[i]);
            rpMgr.setConfigProperties(i, cfg);
            if (cfg.length > 1) {
                performCountryMapping(this.copyRegionFromOther(rpMgr, rpMgr.getId()));
            }
        }

        return regions.size();
    }

    public final int addRegions(String[] configs) {
        return GlomoConfigManager.checkAppCountryPropertiesAreSet() ?
                this.addRegionsWithAppCountryProperties(configs) : this.addRegionsFromConfig(configs);
    }

    private GlomoRegionPolicyManager getNewInstanceWithRegion(String[] configs, String countryName, String countryCode) {
        int id = -1;
        if (countryCode.compareTo("") != 0 && idByCountryCode.containsKey(countryCode)) {
            id = (Integer) idByCountryCode.get(countryCode);
        } else if (countryName.compareTo("") != 0 && idByCountryName.containsKey(countryName)) {
            id = (Integer) idByCountryName.get(countryName);
        }

        return id >= 0 ? this.getNewInstanceWithConfig(configs, id) : null;
    }

    private static GlomoRegion getRegionById(int regionId) {
        return (GlomoRegion) regions.elementAt((Integer) regionsIndexById.get(Integer.valueOf(regionId)));
    }

    private GlomoRegionPolicyManager getNewInstanceWithConfig(String[] configs, int id) {
        if (id < configs.length && id >= 0) {
            GlomoRegionPolicyManager other;
            (other = new GlomoRegionPolicyManager()).setMidletHandler(this.appHandler);
            other.setConfigProperties(id, GlomoConfigLoader.splitString(";", configs[id]));
            return other;
        } else {
            return null;
        }
    }

    public final GlomoRegionPolicyManager getNewInstance(String[] configs, int id) {
        if (GlomoConfigManager.checkAppCountryPropertiesAreSet()) {
            int localId = id;   // Redundant variable
            GlomoRegionPolicyManager self = this;
            if (id < 0) {
                return null;
            } else {
                GlomoRegionPolicyManager other = this.getNewInstanceWithConfig(configs, getRegionById(id).getParentId());
                String[] jadProps = (String[]) configsDescription.get("JAD_" + GlomoConfigManager.getConfigVersion());
                String[] configProps = (String[]) configsDescription.get("CFG_" + GlomoConfigManager.getConfigVersion());

                for(int i = 0; i < jadProps.length; ++i) {
                    String property;    // Example: c_0_name, c_0_code
                    if ((property = self.getMidletProperty("c_" +
                            String.valueOf((Integer) regionsIndexById.get(Integer.valueOf(localId))) +
                            "_" + jadProps[i])).compareTo("") != 0
                    ) {
                        other.putOption(configProps[i], property);
                    }
                }

                return other;
            }
        } else {
            return this.getNewInstanceWithConfig(configs, id);
        }
    }

    public static final int getRegionIdByIndex(int regionIndex) {
        if (regionIndex >= 0 && regionIndex < regions.size()) {
            return GlomoConfigManager.checkAppCountryPropertiesAreSet() ?
                    ((GlomoRegion) regions.elementAt(regionIndex)).getParentId() :
                    ((GlomoRegion) regions.elementAt(regionIndex)).getId();
        } else {
            return -1;
        }
    }

    public static final int getRegionIndex(int regionId) {
        Integer regionsIndex;
        return (regionsIndex = (Integer) regionsIndexById.get(Integer.valueOf(regionId))) == null ? -1 : regionsIndex;
    }

    private static void clearRegions() {
        regions.setSize(0);
        regionsIndexById.clear();
    }

    private static void clearCountriesMapping() {
        idByCountryCode.clear();
        idByCountryName.clear();
    }
}
