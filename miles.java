//Nancy McCoy 2242343

package mccoy1and2;

import java.util.Scanner;

public class miles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter miles covered.
		System.out.print("Enter miles covered : ");
		 int miles = input.nextInt(); 
		
		// Prompts the user to enter gas used.
		System.out.print("Enter gas used: ");
		double gallon = input.nextDouble();
		
		// Compute miles per gallon.
		double mpg = miles / gallon;
		
		// Display result.
		System.out.println("Your miles per gallon is: " + mpg);
	}
} 
