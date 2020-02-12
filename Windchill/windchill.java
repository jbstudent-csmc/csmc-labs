package windchill;
import java.util.Scanner;

public class windchill
/**
 * Programmer: Jon Howard
 */
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	    double temp;               //Setting the temperature as a double.
		double windSpeed;          //Setting the windSpeed as a double.
		double windChill;          //Setting the windChill as a double.
		
		//Allowing input from the user via keyboard and setting input as keyboard.
		Scanner keyboard = new Scanner(System.in);
		
		//Displays what type of program this is on the screen.
		System.out.println("Wind Chill calculator.");
		
		//Prompts the user to enter the temperature in Fahrenheit.
		System.out.println("Please enter the temperature in Fahrenheit."
				+ "(Must be >=-45 and <=40):");
		
		//User inputs the temperature. The input is stored in temp.
		temp = keyboard.nextDouble();
		if(!(temp >= -45) || !(temp <= 40) )
		{
			System.out.println("Incorrect values. Please enter a number between >=-45 and <=40");
			temp =keyboard.nextDouble();
		}
			
		
		
		//Prompts the user to enter the wind speed.
		System.out.println("Please enter the wind speed.(Must be >=5 and <=60:)");
		
		//User inputs the wind speed. The input is stored in windSpeed
		windSpeed = keyboard.nextDouble();
		
		if(!(windSpeed >= 5) || !(windSpeed <= 60) )
		{
			System.out.println("Incorrect values. Please enter a number between >=-5 and <=60");
			windSpeed =keyboard.nextDouble();
		}
			
		
		//Formula to find out the wind chill.
		windChill = 35.74 + (0.6215 * temp) - (35.75 * (Math.pow(windSpeed,0.16))) + (0.4275 * ( temp *(Math.pow(windSpeed,0.16))));
		
		//Displays the wind chill.
		System.out.println("Wind chill temperature is " + windChill + " degrees Fahrenheit\n");
		
		//Displays the Programmer.
		System.out.println("Programmer: Jon Howard");
		
		keyboard.close();
		
		
	}
}