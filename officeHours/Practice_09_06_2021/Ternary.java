package Practice_09_06_2021;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age =scan.nextInt();
        System.out.println("Please enter your weight");
        int weight=scan.nextInt();

        String result=(age>=18)?(weight>50)? "You're elegible to donate blood" :
                "Weight must be greater than 50" :"Age must be greater than 18";

        System.out.println(result);

    }
}
/*
ternary:
?---if
:---else
 */