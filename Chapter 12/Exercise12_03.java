package E12_03;

import java.util.Random;

import java.util.Scanner;


/**
 * <h1>Exercise 12_3</h1>
 * 
 * <p>This class will create an array of random integers and allow
 * a user to see what integer lies at what location with a try-catch</p>
 * 
 * <p>Created 10/19/2021</p>
 * 
 * @author Rhett Boatright
 */
public class Exercise12_03 {

	/**
	 * This method will create the random array of integers and prompt
	 * the user to input what location they would like to see.
	 * 
	 * @param args (String: placeholder for the main method.)
	 * @param user (Scanner: user input detection.)
	 * @param randInts (int[]: array for the random numbers.)
	 * @param ran (Random: allows for random int generation.)
	 * @param count (int: counting the amount of times through the loop.)
	 */
	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		int[] randInts = new int[100];

		Random rand = new Random();
		int count = 0;

		
		//Create for loop to fill the array to be filled.
		for(int i = 0; i < 100; i++) {

			randInts[i] = rand.nextInt();
		}

		//Create a while loop so the user can continue to use the program.
		while(count < 150) {

			System.out.println("Enter a location for the array between 0 and 99: ");

			//Create a try-catch block for an out of bounds exception.)
			try{

				int location = user.nextInt();
				System.out.println("The integer at location " 
				+ location + " is: " + randInts[location] + ".");
				count ++;

			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of bounds. Select a different location.");
			}
		}

	}



}