
public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
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
        String alert = "unlocking via facial recognition";
        return alert;
    }
    @Override
    public void displayInfo() {
        String theCarrier = getCarrier();
        String version = getVersion();
        String iphoneInfo = version + " from " + theCarrier;
        System.out.println(iphoneInfo);
    }
}