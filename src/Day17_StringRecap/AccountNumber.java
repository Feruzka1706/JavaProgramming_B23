package Day17_StringRecap;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String account=scan.next();

        if(account.length()==7||account.length()==10){

            if(account.charAt(0)=='2'&&account.length()==7){//if the first character is 2 and has 7 characters
                System.out.println("Valid account");
            }else if(account.charAt(0)=='5'&&account.length()==10){//if the first character is 5 and has 10 characters
                System.out.println("Valid account");
            }else {//not starts 2 or 5 but length is 7 or 10
                System.out.println("Invalid Account");
            }


        }else{
            System.out.println("Invalid Account");//account length is no1 7 or 10
        }



    }
}
/*
Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5
    OR the account number lengths do not meet the expected results print “Invalid account number”
 */