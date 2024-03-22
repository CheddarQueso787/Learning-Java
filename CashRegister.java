//Cash Register

import java.util.Scanner;

public class Project1_IleanaPerez {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double burgerPrice = 2.50;	
		double friesPrice = 3.50;
		double cokePrice = 2.25;
		double waterPrice = 1.00;
		

		System.out.println("Welcome to the UMW cash register! Enter the desired quantity for each item.");
		
		System.out.print("Hamburgers: ");
		int burgerNum = scan.nextInt();
		
		System.out.print("Fries: ");
		int friesNum = scan.nextInt();

		System.out.print("Coca-Cola: ");
		int cokeNum = scan.nextInt();

		System.out.print("Water: ");
		int waterNum = scan.nextInt();
		
		double total = (burgerNum * burgerPrice) + (friesNum * friesPrice) + (cokeNum * cokePrice) + (waterNum * waterPrice);
		System.out.println ("Your total is: $" + (String.format("%.02f", total) + ". Thank you, come again!"));

		
	}
}
