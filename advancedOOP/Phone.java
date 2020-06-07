public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract void displayInfo();

    public String getCarrier() {
        String gotCarrier = this.carrier;
        return gotCarrier;
    }
    public String getVersion() {
        String gotVersion = this.versionNumber;
        return gotVersion;
    }
}