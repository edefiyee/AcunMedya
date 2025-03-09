public class SavingAccaount extends BankAccount{
    public SavingAccaount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05; // %5 faiz
        System.out.println("Vadeli Hesap Faizi: " + interest);

    }
}
