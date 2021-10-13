import java.util.Date;
/**
 * <h1>Exercise09_07</h1>
 * 
 * <p>This class will make a new account and call upon 'Account' to print out the results.</p>
 * 
 * <p> Created: 10/13/2021</p>
 * 
 * @author Rhett Boatright
 */
public class Exercise09_07 {
	/**
	 * This method will determine the account1 object and print out results.
	 * 
	 * @param args (String; placeholder for the main method.)
	 */
	public static void main(String[] args) {
		
		//Create the account.
		Account account1 = new Account();
		account1.id = 1122;
		account1.balance = 20000;
		account1.annualInterestRate = 4.5;
		account1.dateCreated.getDate();
		account1.getMonthlyInterestRate();
		account1.withdraw();
		account1.deposit();
		
		//Print out results.
		System.out.println("Account: " + account1.id
				+ "\n---------------------------"
				+ "\n Balance: " + account1.balance
				+ "\n Monthly interest: " + account1.getMonthlyInterest()
				+ "\n Date Created: " + account1.dateCreated);
	}

}

//Create an Account class.
/**
 * <p>This class is the 'Account' object.<p>
 * 
 * <p>Created: 10/13/2021<p>
 * 
 * @author Rhett Boatright
 */
class Account{
	
	//Create all private fields for the account.
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated = new Date();
	double monthlyInterestRate;
	
	//Create no arg constructor.
	Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated.getDate();
	}
	
	//Create the second constructor.
	Account(int newId, double newBalance, double newAnnualInterestRate, Date newDateCreated){
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = newDateCreated;
	}
	
	//Create method for obtaining monthly interest rate.
	/**
	 * This method will determine the monthly interest rate.
	 * 
	 * @return
	 */
	double getMonthlyInterestRate() {
		return  monthlyInterestRate = (annualInterestRate / 100) / 12;
	}
	
	//Create method for obtaining monthly interest.
	/**
	 * This method will determine the monthly interest.
	 * @return
	 */
	double getMonthlyInterest() {
		return balance * monthlyInterestRate;
	}
	
	//Create method for withdrawing.
	/**
	 * This method will withdraw the amount.
	 * @return
	 */
	double withdraw() {
		return balance -= 2500;
	}
	
	//Create method for depositing.
	/**
	 * This method will deposit the amount.
	 * @return
	 */
	double deposit() {
		return balance += 3000;
	}
}
