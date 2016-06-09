// Nancy McCoy 2242343

package mccoy1and2;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompts user to enter a number.
		System.out.print("Enter a number : ");
		 int numerator = input.nextInt(); 
		 
		 System.out.print("Enter another number less than the first : ");
		 int demoninator = input.nextInt(); 
		 
		 // Calculates the expression to a mixed number.
		 int whole = numerator / demoninator;
		 int mixed = numerator % demoninator;
		 
		 System.out.println("Your mixed number is: " + whole + " "  + mixed + "/" + demoninator);
	}

}
