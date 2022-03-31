package javax.microedition.pim;

import java.util.Enumeration;

public class ContactList implements PIMList {
    public void close() throws PIMException {
    }

    public Enumeration items() {
        return new Enumeration() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public Object nextElement() {
                return null;
            }
        };
    }

    public boolean isSupportedField(int field) {
        return true;
    }
}
