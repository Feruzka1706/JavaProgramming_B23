package Day19_Loops;


import java.util.Scanner;

public class LoopPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int sum =0;

        for (int i = 1; i <=num ; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);

        System.out.println("--------------------------------------");


    }
}
