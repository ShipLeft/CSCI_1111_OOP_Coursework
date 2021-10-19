package E11_03;

public class SavingsAccount extends Account {

    public SavingsAccount(){

    }


    public SavingsAccount(
            double balance, double annualInterestRate,
            int id, double deposit, double withdraw){

        setId(id);
        setBalance(balance);
        setAnnualInterestRate(annualInterestRate);
        setDeposit(deposit);
        setWithdraw(withdraw);

    }
    //Method to return withdraw.
    public void setWithdraw(double withdraw){
        boolean b = true;
    	double balance1 = super.getBalance();
        if(withdraw <= balance1) {
            super.setWithdraw(withdraw);
        }
        else {
            b = false;
         }
         if(b == false) {
         	System.out.print("\nCannot overdraw savings account.");
         }
    }
    public String toString() {
        return "Savings account " + super.toString();
    }
}
