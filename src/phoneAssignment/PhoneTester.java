package phoneAssignment;

public class PhoneTester {

	public static void main(String[] args) {
		// create 2 instances from the classes that are pulling from the abstract class Phone
		Iphone iphoneTen = new Iphone("X", 100, "AT&T", "Zing");
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		
//		Phone testPhone = new Phone("hi", 88, "lskdlskjd", "bingo!");//NOTE: this can't be done since you can't instantiate  directly from an ABSTRACT class
		
		//testing outputs
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
		
	}

}
