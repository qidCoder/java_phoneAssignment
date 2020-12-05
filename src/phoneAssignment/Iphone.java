package phoneAssignment;

public class Iphone extends Phone implements Ringable {
	//constructor to call the super constructor in the abstract class Phone
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);//sends all the inputs to the super class to create the instance
    }
    
    
    @Override
    public String ring() {
        return String.format("iPhone %s says %s", this.getVersionNumber(), this.getRingTone());
    }
    @Override
    public String unlock() {
        return ("Unlocking via facial recognition");
    }
    @Override
    public void displayInfo() {
        System.out.printf("iPhone %s from %s\n", this.getVersionNumber(), this.getCarrier());            
    }
}