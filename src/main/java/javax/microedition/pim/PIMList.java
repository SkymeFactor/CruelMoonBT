package javax.microedition.pim;

import java.util.Enumeration;

public interface PIMList {
    void close() throws PIMException;

    Enumeration items();

    boolean isSupportedField(int field);
}
