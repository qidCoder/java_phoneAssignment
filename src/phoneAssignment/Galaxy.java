package phoneAssignment;

public class Galaxy extends Phone implements Ringable {
	//constructor to call the super constructor in the abstract class Phone
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);//sends all the inputs to the super class to create the instance
    }
    
    
    @Override
    public String ring() {
        return String.format("Galaxy %s says %s", this.getVersionNumber(), this.getRingTone());
    }
    @Override
    public String unlock() {
        return ("Unlocking via finger print");
    }
    @Override
    public void displayInfo() {
        System.out.printf("Galaxy %s from %s\n", this.getVersionNumber(), this.getCarrier());            
    }
}