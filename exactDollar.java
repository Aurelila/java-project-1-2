// Nancy McCoy  2242343

package mccoy1and2;

import java.util.Scanner;

public class exactDollar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		// Prompts the user to enter the purchase amount.
		System.out.print("Enter the purchase amount in dollars: ");
			int purchase = input.nextInt();
			
			// Finds the remaining amount of money left
			int remainingAmount = (int)(100 - purchase);
			
			System.out.println("Your change is" + remainingAmount + "as follows: ");
			
			// Find the number of twenties.
			int twentyDollars = remainingAmount / 20;
			remainingAmount = remainingAmount % 20;
			
			// Find the number of tens.
			int tenDollars = remainingAmount / 10;
			remainingAmount = remainingAmount % 10;
			
			// Find the number of fives.
			int fiveDollars = remainingAmount / 5;
			remainingAmount = remainingAmount % 5;
			
		
			// Find the number of ones.
			int oneDollars = remainingAmount / 1;
			remainingAmount = remainingAmount % 1;
			
			System.out.println(twentyDollars + "twenties" + tenDollars + "ten" + fiveDollars + "fives" + oneDollars + "ones");
	}

}
