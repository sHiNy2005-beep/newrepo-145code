package lab2;
//Ruchika Paladugu
import  java.util.Scanner;

public class Lab2 {

	public static final double A=9.8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner key = new Scanner(System.in);

		System.out.println("Enter the  initial velocity  of the ball(in meters per second at point A):");
		
		double initial = key.nextDouble();

		System.out.println("How much time(in seconds) does the ball take to reach point B:");

		double time= key.nextDouble();
		
		double finalvelocity = initial + (A * time);
		double distancetraveledbytheball = (initial * time) + (0.5 * A * time * time);
		
		System.out.println("Final velocity of the ball = "+ finalvelocity + "m/s");
		System.out.println("Distance traveled by the ball = "+ distancetraveledbytheball + "meters");

		// lap question 3

		System.out.println(" Monday");
		System.out.println("Tuesday");
		System.out.println("Wednesday");
		System.out.println(" Thursday");
		System.out.println("Friday");
		System.out.println(" Saturday");
		System.out.println(" Sunday");
		

		
		
	}

}
