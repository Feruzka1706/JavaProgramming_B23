package day43_OOP_Encaplsulation;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, int balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            return;
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void checkBalance(){
        System.out.println(accountHolder+": balance is "+balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
}
/*
 create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields
        add a constructor that can set all the instances
        Extra methods:
                deposit()
                withdraw()
                checkBalance()
                toString()

            DO NOT duplicate any code fragments

 */