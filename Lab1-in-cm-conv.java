//this program will convert a measurement from inches to centimenters

import java.util.Scanner;

public class Labs1 {
	
	public static void main(String[] args) {
		
		//create a Scanner for std input
		Scanner in = new Scanner(System.in);
		
		//declare the variables here
		double valueInches = 0;
		double valueCentimeters = 0;
		
		
		System.out.println("Please enter a distance in inches: ");
		
		//read the inches measurement here
		valueInches = in.nextDouble();
		in.nextLine();
		
		//calculate the conversion to cm here
		valueCentimeters = valueInches * 2.54;
		
		System.out.println("The distance in cm is: " + valueCentimeters);
	}

}
