package Day22_LoopsTopic;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        int i =12;
        int sum=0;
         do{
             if(i%2==0){
                 sum+=i;
             }
             i++;//iterator after the statement
         }while(i<=10);
        System.out.println(sum);
        //this way also we can give iterator

        System.out.println("---------------------------------------");
        Scanner scan =new Scanner(System.in);
        String username ="JohnJames";
        String password="John123";
        String us = "";
        String pass= "";
        int attempts=1;

        do{
            System.out.println("Enter your username:");
             us = scan.next();

            System.out.println("Enter your password:");
            pass= scan.next();



        }while( !(us.equals(username)&& pass.equals(password)) );


        System.out.println("Logged in");
    }
}
