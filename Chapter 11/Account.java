package E11_03;

public class Account{

    //Data fields for GeometricObject.
    private int id = 0;
    private double balance = 0;
    private java.util.Date dateCreated;
    private double annualInterestRate = 0;
    private double deposit = 0;
    private double withdraw = 0;

    //Default construct.
    public Account(){

    }

    //Specified construct with color and filled values.
    public Account(int id, double balance, double annualInterestRate){
        dateCreated = new java.util.Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //Method to return id.
    public int getId(){
            return id;
    }

    //Method to set id.
    public void setId(int id){
        this.id = id;
    }

    //Method to return balance.
    public double getBalance(){

        return balance;
    }

    //Method to set balance.
    public void setBalance(double balance){

        this.balance = balance;
    }

    //Method to return monthly interest rate.
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    //Method to set annual interest rate.
    public void setAnnualInterestRate(double annualInterestRate){

        this.annualInterestRate = annualInterestRate;
    }

    //Method to obtain the date created.
    public java.util.Date getDateCreated(){

        return dateCreated;
    }

    //Method to return deposit.
    public double getDeposit(double balance) {
        balance += deposit;
        return balance;
    }

    //Method to set deposit.
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    //Method to return withdraw.
    public double getWithdraw(double balance){
        balance -= withdraw;
        return balance;
    }

    //Method to set withdraw.
    public void setWithdraw(double withdraw){
        this.withdraw = withdraw;
    }

    //Method to return the string of the object created.
    public String toString(){

        return "Id: #" + id + "\nCreated on: " + dateCreated
                + "\nBalance: $" + balance + " Annual interest rate: %" + annualInterestRate
                + "\n Deposited: $" + deposit + " Withdrawn: $" + withdraw;
    }
}