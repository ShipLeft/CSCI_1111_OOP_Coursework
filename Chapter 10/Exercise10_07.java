package E10_07;

import java.util.Date;
import java.util.Scanner;
/**
 *<h1>Exercise09_07</h1>
 * 
 *<p>This class will make new accounts and call upon 'Account' to print out the results.</p>
 * 
 *<p> Created: 10/13/2021</p>
 * 
 *@author Rhett Boatright
 */
public class Exercise10_07 {
	/**
	 *This method will determine the accounts object and print out results.
	 * 
	 *@param args (String; placeholder for the main method.)
	 *@param choice (int; input from the user for the main menu.)
	 */
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		//Create the account.
		Account[] accounts = new Account[10];
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].balance = 100;
		}
		
		//Prompt user to input account id.
		System.out.println("Enter an id: ");
		while(true) {
			for(int i = 0; i < accounts.length; i++) {
				accounts[i].id = user.nextInt();
		int choice = 0;
		double newBalance;
			while(choice != 4) {
				
				while(true) {
		
				//Prompt user to input menu action.
				System.out.println("Main menu\n"
						+ "1: Check balance\n"
						+ "2: Withdraw\n"
						+ "3: Deposit\n"
						+ "4: Exit\n"
						+ "Enter a choice:");
				choice = user.nextInt();
				if(choice == 1) {
					newBalance = accounts[i].balance;
					System.out.println("The balance is: $" + accounts[i].balance + ".");
				}
				if(choice == 2) {
					accounts[i].withdraw();
				}
				if(choice == 3) {
					accounts[i].deposit();
				}
				if(choice == 4) {
					break;
				}
				break;
				}
				}System.out.println("Enter an id: ");
			}
		
		//Print out results.
		}
	}

}

//Create an Account class.
/**
 *<p>This class is the 'Account' object.<p>
 * 
 *<p>Created: 10/13/2021<p>
 * 
 *@author Rhett Boatright
 */
class Account{
	
	//Create all private fields for the account.
	int id;
	double balance;
	
	//Create no arg constructor.
	Account(){
		id = 0;
		balance = 0;
	}
	
	//Create the second constructor.
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	//Create method for withdrawing.
	/**
	 *This method will withdraw the amount.
	 *@return
	 */
	double withdraw() {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter amount to withdraw: ");
		int withdraw = user.nextInt();
		return balance -= withdraw;
	}
	
	//Create method for depositing.
	/**
	 *This method will deposit the amount.
	 *@return
	 */
	double deposit() {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter amount to deposit: ");
		int deposit = user.nextInt();
		return balance += deposit;
	}
}
