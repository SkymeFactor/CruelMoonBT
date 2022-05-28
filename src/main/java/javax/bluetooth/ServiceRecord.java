package javax.bluetooth;

public class ServiceRecord {
    public RemoteDevice getHostDevice() {
        return new RemoteDevice();
    }

    public String getConnectionURL(int requiredSecurity, boolean mustBeMaster) {
        return new String();
    }

    public boolean setAttributeValue(int attrID, DataElement attrValue) {
        return true;
    }
}
