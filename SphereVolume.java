package sphere;
import java.util.Scanner;
public class SphereVolume {
// Programmer Jon Howard
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diam;             //Holds the diameter
		double radius;           //Holds the radius
		double volume;           //Holds the volume
		Scanner keyboard = new Scanner (System.in);          //Scanner class to get input from the user
		
		System.out.println("Sphere Volume Calculator");
		System.out.println("Please enter the diameter of the sphere.");
		diam = keyboard.nextDouble();                       //Saves input to diameter.
		radius = (diam/2);                                  //Calculates the radius
		volume = (4.0/3)*Math.PI*(Math.pow(radius, 3) );    //Calculates the volume
		//volume = (4*Math.PI*(Math.pow(radius, 3))/(3));
		//volume = (4.0 / 3) * Math.PI * radius * radius * radius;
		System.out.println(volume);                         // Outputs the volume
	} 

}
