//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount saving=new SavingAccaount("Edefiye ERKEK",500) ;
        BankAccount checking =new CheckingAccount("Edefiye ERKEK",100);
        saving.calculateInterest();  // Vadeli hesap için faiz hesaplanacak
        checking.calculateInterest();

        };

    }
