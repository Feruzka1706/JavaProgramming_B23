package day43_OOP_Encaplsulation;

public class GoldenOneObject {
    public static void main(String[] args) {
         BankAccount bankAccount=new BankAccount(null,0,0);
         bankAccount.setAccountHolder("Feruza");
         bankAccount.setAccountNumber(112306);
         bankAccount.setBalance(37500);
         System.out.println(bankAccount);

        System.out.println(bankAccount.getAccountHolder() );
        System.out.println(bankAccount.getAccountNumber() );
        System.out.println(bankAccount.getBalance() );

        System.out.println("===================================================");
        bankAccount.deposit(2500);
        bankAccount.checkBalance();
        bankAccount.withdraw(1800);
        bankAccount.checkBalance();
    }
}
