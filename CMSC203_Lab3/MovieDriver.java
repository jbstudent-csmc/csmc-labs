import java.util.Scanner;
/**
 * @author Jon Howard
 * CSMC 203 Lab 3
 * Professor: Eivazi
 */
public class MovieDriver {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner keyboard = new Scanner(System.in);              //Creating a new scanner class to take input from the keyboard.
		Movie mov = new Movie();                                //Creating a mov class to call to Movie.java
		String title;                                           //Setting title to a string.
		String rating;                                          //Setting rating to a string. 
		int tickets;                                            //Setting an integer to to tickets.  
		char answer;                                            //Setting answer to a character
		
		do {
			//Do while loop that asks for the name of the movie,rating and number of tickets sold.
			
		System.out.println("Enter the name of a movie");
		title = keyboard.nextLine();   //Taking input from the user via keyboard.
		mov.setTitle(title);           // Passing title to setTitle in Movie.java
		
		System.out.println("Enter the rating of the movie");
	    rating = keyboard.nextLine(); //Taking input from the user via keyboard.
	    mov.setRating(rating);        //Passing rating to setRating in Movie.java
		
		
		System.out.println("Enter the number of tickets sold for this movie");
		tickets = keyboard.nextInt(); //Taking input from the user via keyboard.
		mov.setSoldTickets(tickets); //Passing tickets to setSoldTickets
		
		//mov.toString();
		System.out.println(mov.toString()); //Printing out toString from Movie.java
		
		
		
		System.out.println("Do you want to enter another? (y or n)");
		answer = keyboard.next().charAt(0);  //Reading the first value if Y or y.
		keyboard.nextLine();                 // Creating a nextline to fix an error.
		}
		while (answer == 'y' || answer == 'Y'); //While loop to check user validation if they want to continue.
		
		System.out.println("Goodbye"); //Goodbye message ending the program.
		
	}

}
