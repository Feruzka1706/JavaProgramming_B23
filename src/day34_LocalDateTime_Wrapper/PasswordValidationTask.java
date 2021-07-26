package day34_LocalDateTime_Wrapper;

import java.util.Scanner;

public class PasswordValidationTask {
    public static void main(String[] args) {
       /*
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a password:");
        String password=scan.next();

        */

        String password="passworD1";                    //"Cyb3rTek1!";

        boolean r1= password.length() >=8 && !password.contains(" ");
        boolean hasUpperCase =false;
        boolean hasLowerCase=false;
        boolean hasDigit=false;
        boolean hasSpecialChar=false;

        for( char each: password.toCharArray() ){
            if( Character.isUpperCase(each)){
                hasUpperCase=true;
            }else if(Character.isLowerCase(each)){
                hasLowerCase=true;
            }else if(Character.isDigit(each)){
                hasDigit=true;
            }else{ // !Character.isLetterOrDigit(each)
                hasSpecialChar=true;
            }

        }

        boolean correctPassword= r1 && hasUpperCase && hasLowerCase && hasDigit &hasSpecialChar;

        System.out.println("correctPassword = " + correctPassword);

        if( !r1){
            System.out.println("The password does not have 8 characters or it contains space");
        }
        if( !hasUpperCase){
            System.out.println("The password does not have Upper case letter");
        }
        if( !hasLowerCase){
            System.out.println("The password does not have lower case letter");
        }
        if( !hasDigit){
            System.out.println("The password does not contain digit");
        }
        if( !hasSpecialChar){
            System.out.println("The password does not contain special character");
        }
        if( !password.contains(",")){

        }





    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case  letter
                3.PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */