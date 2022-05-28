//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

public final class GlomoRegion {
    private int id = -1;
    private int parentId = -1;
    private String countryName = "";
    private String countryCode = "";

    public GlomoRegion(int id, String countryName, String countryCode) {
        this.id = id;
        this.parentId = id;
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public final String getCountryName() {
        return this.countryName == "" ? this.countryCode : this.countryName;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final int getId() {
        return this.id;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int setParentId(int id) {
        return this.parentId = id;
    }
}
