package Day22_LoopsTopic;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your username:");
        String username =scan.next();//to store user entered
        System.out.println("Enter your password:");
        String password=scan.next();//to store user entered password

        String correctUsername="cybertek";
        String correctPassword="cybertek12345";

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Logged in");
        }else {//if user provides incorrect username or password

            for (int i = 1; i <=2; i++) {
                System.out.println("Username or password is incorrect, please re-enter");
                System.out.println("Enter your username:");
                username=scan.next();

                System.out.println("Enter your password:");
                password=scan.next();


                if(username.equals(correctUsername)&&password.equals(correctPassword)){
                    //if the user enters correct credintials
                    System.out.println("Logged in");
                    break;//stops the loop
                }
                if(i==2){//if user entered credentials are incorrect, and we already used all attempts
                    System.out.println("Your account is locked");
                    System.exit(0);
                }
            }

        }


        System.out.println("Hello Cybertek!");
        //this message should ONLY be  displayed if the user logged in
        scan.close();


    }
}
/*
You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user to have three attempts to enter
                correct credentials and if all three attempts are failed,
                then print "Your account is locked."
 */