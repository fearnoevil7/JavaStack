public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String version = getVersion();
        String ring = version + " says ring ring ring";
        return ring;
    }
    @Override
    public String unlock() {
        String alert = "unlocking via fingerprint";
        return alert;
    }
    @Override
    public void displayInfo() {
        String theCarrier = getCarrier();
        String version = getVersion();
        String galaxyInfo = version + " from " + theCarrier;
        System.out.println(galaxyInfo);
    }
}