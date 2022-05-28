package javax.microedition.pim;

public interface PIMItem {
    int countValues(int field);

    String getString(int field, int index);
}
