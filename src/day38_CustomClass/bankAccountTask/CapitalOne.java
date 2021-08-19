package day38_CustomClass.bankAccountTask;

import day38_CustomClass.bankAccountTask.BankAccount;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        account1.setInfo("Christian", 123456789);
        account1.checkBalance();

        account1.deposit(1000);
       account1.checkBalance();

       account1.withdraw(999);
       account1.checkBalance();
       account1.withdraw(25);
       account1.checkBalance();
       account1.withdraw(10);
       account1.deposit(10000);
       account1.checkBalance();

        System.out.println("--------------------------------------------------------");

        BankAccount account2=new BankAccount();
        account2.setInfo("Ahmad",789456123);

    }
}
