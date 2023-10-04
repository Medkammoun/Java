public class BankAccount{

    private double checkingBalance;
    private double savingsBalance;
    

    private static int numberOfAccounts;
    private static double totalAmount;


    public BankAccount(){
        this.checkingBalance=0;
        this.savingsBalance=0;
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    private void setCheckingBalance(double newCheckingBalance){
        this.checkingBalance=newCheckingBalance;
    }

     public double getSavingsBalance(){
        return this.savingsBalance;
    }
    private void setSavingsBalance(double newSavingsBalance){
        this.savingsBalance=newSavingsBalance;
    }

    public void depositChecking(double amount){
        System.out.println("------------------Deposit in Checking------------------");
        System.out.println("current balance: "+getCheckingBalance());
        this.setCheckingBalance((this.getCheckingBalance() + amount));
        System.out.println("New Checking balance: "+getCheckingBalance());
        System.out.println("-----------------------------------------------------");
        totalAmount+=amount;
    }
    public void depositSavings(double amount){
        System.out.println("------------------Deposit in Saving------------------");
        System.out.println("current balance: "+getSavingsBalance());
        this.setSavingsBalance((this.getSavingsBalance() + amount));
        System.out.println("New Saving balance: "+getSavingsBalance());
        System.out.println("-----------------------------------------------------");
        totalAmount+=amount;
    }
    public double getTotalAmount(){
        return totalAmount;
    }

    public void displayStat(){
        System.out.println("-----------------------------------------------------");
        System.out.println("checking balance = "+getCheckingBalance());
        System.out.println("savings balance = "+getSavingsBalance());
        System.out.println("-----------------------------------------------------");
    }
}