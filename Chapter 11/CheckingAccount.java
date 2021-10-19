package E11_03;

public class CheckingAccount extends Account {
    private double overDraftLimit = -50;

   public CheckingAccount(){

    }


    public CheckingAccount(
            double balance, double annualInterestRate,
            int id, double deposit, double withdraw){
       super(id, balance, annualInterestRate);
       setDeposit(deposit);
       setWithdraw(withdraw);
       


    }

    //Method to return withdraw.
    public void setWithdraw(double withdraw){
        double balance1 = super.getBalance();
        boolean b = true;
        if(overDraftLimit <= balance1 - withdraw) {
            super.setWithdraw(withdraw);
        }
        else {
           b = false;
        }
        if(b == false) {
        	System.out.print("\nCannot overdraw anymore than $" + overDraftLimit + ".");
        }
    }
    public String toString() {
        return "Checking account " + super.toString();
    }
}