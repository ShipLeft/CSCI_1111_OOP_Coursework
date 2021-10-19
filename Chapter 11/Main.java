package E11_03;

/**
 *<h1>Main</h1>
 *
 *<p> This class will test CheckingAccount, SavingsAccount, and Account classes.</p>
 * 
 *<p>Created: 10/19/2021</p>
 * 
 *@author Rhett Boatright
 */
public class Main {
    public static void main(String[] args) {
    	savings();
    	account();
    	checking();
    	
    }
    
    /**
     *This method will test SavingsAccount.
     */
    public static void savings() {

    	 SavingsAccount savingsAccount1 = new SavingsAccount(100, 4.5,
                 2246, 25, 126);
         System.out.println("\n" + savingsAccount1.toString());

         SavingsAccount savingsAccount2 = new SavingsAccount(100, 4.5,
                 2247, 25, 50);
         System.out.println("\n" + savingsAccount2.toString());
    }
    
    /**
     *This method will test Account.
     */
    public static void account() {

         Account account1 = new Account(2248, 100,
                 4.5);
         System.out.println("\n" + account1.toString());
    }
    
    /**
     *This method will test CheckingAccount.
     */
    public static void checking() {
    	CheckingAccount checkingAccount1 = new CheckingAccount(100, 4.5,
                2244, 25, 300);
        System.out.println("\n" + checkingAccount1.toString());

        CheckingAccount checkingAccount2 = new CheckingAccount(100, 4.5,
                2245, 25, 50);
        System.out.println("\n" + checkingAccount2.toString());

    }
}