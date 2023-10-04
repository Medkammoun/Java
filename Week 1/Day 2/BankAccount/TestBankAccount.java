public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.displayStat();
        account1.depositChecking(100);
        account1.depositSavings(250);
        System.out.println("Your Total Amount : "+account1.getTotalAmount());
        account1.displayStat();
    }
}
