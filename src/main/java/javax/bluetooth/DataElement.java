package javax.bluetooth;

public class DataElement extends Object {
    // =================== Object types ===================
    public static final int	BOOL = 40;
    public static final int	DATALT = 56;
    public static final int	DATSEQ = 48;
    public static final int	INT_1 = 16;
    public static final int	INT_16 = 20;
    public static final int	INT_2 = 17;
    public static final int	INT_4 = 18;
    public static final int	INT_8 = 19;
    public static final int	NULL = 0;
    public static final int	STRING = 32;
    public static final int	U_INT_1 = 8;
    public static final int	U_INT_16 = 12;
    public static final int	U_INT_2 = 9;
    public static final int	U_INT_4 = 10;
    public static final int	U_INT_8 = 11;
    public static final int	URL = 64;
    public static final int	UUID = 24;

    // =================== Fields ===================
    private Object value;
    private int valueType;

    public DataElement(int valueType, Object value) throws IllegalArgumentException {
        // Check data type
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            switch (valueType) {
                case URL, STRING -> {
                    if (!value.getClass().equals(java.lang.String.class))
                        throw new IllegalArgumentException();
                }
                case UUID -> {
                    if (!value.getClass().equals(javax.bluetooth.UUID.class))
                        throw new IllegalArgumentException();
                }
                case INT_16, U_INT_16 -> {
                    if (!(value instanceof byte[]) || ((byte[])value).length != 16 )
                        throw new IllegalArgumentException();
                }
                case U_INT_8 -> {
                    if (!(value instanceof byte[]) || ((byte[])value).length != 8 )
                        throw new IllegalArgumentException();
                }
                default -> {throw new IllegalArgumentException();}
            }

            // Assign the values
            this.value = value;
            this.valueType = valueType;
        }
    }
}
