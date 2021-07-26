package Day20_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num =scan.nextInt();//5*4*3*2*1
        int result=1;

        for (int i = num; i >=1 ; i--) {//i: 5, 4, 3, 2, 1
            result*=i;
     
        }
        System.out.println("result = " + result);
        scan.close();

    }
}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */