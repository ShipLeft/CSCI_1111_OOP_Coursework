package E12_15;

import java.util.Random;
import java.util.Scanner;

/**
 * <h1>Exercise 12_3</h1>
 * 
 * <p>This class will make a new text file and populate it with
 * random integers, then it will read the integers back,
 * sort them into increasing order and print out the results.</p>
 * 
 * <p>Created: 10/19/2021</p>
 * 
 * @author Rhett Boatright
 */
public class Exercise12_15 {
	
	/**
	 * This method will make the new txt file as well as populate it
	 * with random numbers. It will also read the numbers back into
	 * the method from the file.
	 * 
	 * @param args (String: placeholder for the main method.)
	 * @param numbers (int[]: array of random numbers.)
	 * @param random (Random: way to get random ints.)
	 * @param fileNumbers (int[]: array of numbers read from the file.)
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws java.io.IOException{
		
		int[] numbers = new int[100];
		Random random = new Random();
		int[] fileNumbers = new int[100];
		
		//Create for loop to fill the array.
		for(int i = 0; i < 100; i++) {
			numbers[i] = random.nextInt();
		}
		
		//Create the new file Exercise12_15.txt.
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if(file.exists()) {
			System.out.println("File already exists.");
			System.exit(1);
			}
		
		//Import scanner to allow for the reading of the file.
		Scanner input = new Scanner(file);
		
		//Automatic closing writing try.
		try(
		java.io.PrintWriter write = new java.io.PrintWriter(file);){
		
		//for loop to write the array into the file.	
		for(int i = 0; i < 100; i++) {
			write.print(numbers[i] + " ");
			}
		}
		
		//while loop and for loop to fill the next array.
		while (input.hasNext()) {
			for(int i = 0; i < 100; i++) {
			
				fileNumbers[i] = input.nextInt();
			}
		}
		sort(fileNumbers);
	}
	
	/**
	 * This method will sort the array from the text file.
	 * 
	 * @param fileNumbers (int[]: array from the text file.)
	 * @param temporary (int: holds the fileNumbers[i] for sorting.)
	 * @return fileNumbers
	 */
	public static int[] sort (int[] fileNumbers) {
		int temporary;
		for(int i = 0; i < fileNumbers.length - 1; i++) {
			if(fileNumbers[i] > fileNumbers [i+1]) {
				temporary = fileNumbers[i];
				fileNumbers[i] = fileNumbers[i+1];
				fileNumbers[i+1] = temporary;
				i = -1;
			}
		}
		for(int i = 0; i< 100; i++) {
			System.out.println(fileNumbers[i]);
		}
		return fileNumbers;
		
	}
}
