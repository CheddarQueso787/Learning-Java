// ISBN Validator 

import java.util.Scanner; 

public class Lab7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		// prompt and get number of items on the list 
		System.out.println(" Welcome. Please enter the number of items on your grocery list: ");
		int itemCount =  in.nextInt();
		System.out.println("You have " + itemCount + " items on your list.");
		in.nextLine();
		
		//create the array
		String[] groceryList = new String[itemCount];
		
		//loop the number times = the number of items on the list
		for (int i = 0; i < itemCount; i++) {	
			System.out.println("Enter item " + (i + 1) + ": ");
			groceryList[i] = in.nextLine();
	    }

		//print header
		System.out.println("My Grocery List: ");
			
		//loop through the list and print each item	
		for (String groceryItems : groceryList) {
			System.out.println(groceryItems);
			
		
		}
	}
}	

