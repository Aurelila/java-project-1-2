// Nancy McCoy 2242343

package mccoy1and2;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Enter length of one side of a triangle.
		System.out.print("Enter a side length : ");
		 double side1 = input.nextDouble(); 
		
		 // Enters another length for the second side.
		 System.out.print("Enter another side length : ");
		 double side2 = input.nextDouble(); 
		 
		 // Calculates both lengths to get the third and final side length.
		 double side3 = (Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2)));
		 
		 System.out.println("Your length for the last side is: " + side3);
				 
	}

}
