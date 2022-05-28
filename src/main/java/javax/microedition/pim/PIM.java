package javax.microedition.pim;

public class PIM {
    public static PIM getInstance() {
        return null;
    }

    public PIMList openPIMList(int PIMListType, int PIMMode) throws PIMException {
        return new ContactList() {
        };
    }
}
