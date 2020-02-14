package numerictypes;

import java.util.Scanner;
// Programmer: Jon Howard
/**
This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner keyboard = new Scanner(System.in);
		//identifier declarations
		double temp;
		final int NUMBER = 0; // number of scores
		double score1 = 100.0; // first test score
		double score2 = 95.0; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC ; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		System.out.println("Please enter the first temperature");
		//Task #2 declare a variable to hold the user’s temperature
		 temp = keyboard.nextDouble();
		//Task #2 prompt user to input score1
		System.out.println("Please enter the first score");
		//Task #2 read score1 
		score1 = keyboard.nextInt();
		//Task #2 prompt user to input score2
		System.out.println("Please enter the second score");
		//Task #2 read score2 
		score2 = keyboard.nextInt();
		// Find an arithmetic average
		average = (score1 + score2) / 2;
		output = (score1 + " and " + score2 + " have an average of " + average);	
		System.out.println("The average is " + average);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5/9) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is 100 in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Please enter another temperature");
		//Task #2 read the user’s temperature in Fahrenheit
		temp = keyboard.nextDouble();
		//Task #2 convert the user’s temperature to Celsius
		temp = (temp - 32)*5/9;
		//Task #2 print the user’s temperature in Celsius
		System.out.println( "The temperature in celsius is " +temp);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

