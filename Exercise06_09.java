package E6_9;

import java.text.DecimalFormat;

public class Exercise06_09 {
	public static void main(String[] args) {
		
		//Create variables to be used.
		double foot = 1.0, meter = 20.0;
		
		System.out.println("Feet    Meters    Meters    Feet");
		
		//Create new decimal format
		DecimalFormat decimal = new DecimalFormat("0.000");
		
		//Create loops to add 1 and 5 to feet and meters respectively and print results
		for(int i = 0; i < 10; i++) {
			System.out.print("\n" + foot + "    " + decimal.format(footToMeter(meter)));
			foot++;
			System.out.print("    " + meter + "    " + decimal.format(meterToFoot(meter)) + "\n");
			meter += 5;
		}
		
	}

	//Create new method for foot to meter
	public static double footToMeter(double foot) {
		
		//Create equation to convert feet to meters
		double meter = 0.305 * foot;
		return meter;
	}
	
	//Create new method for meter to foot
	public static double meterToFoot(double meter) {
		
		//Create equation to convert meters to feet
		double foot = 3.279 * meter;
		return foot;
	}
}
