package javax.bluetooth;

public interface ServiceRecord {
    RemoteDevice getHostDevice();
    String getConnectionURL(int requiredSecurity, boolean mustBeMaster);
    boolean setAttributeValue(int attrID, DataElement attrValue);
}
