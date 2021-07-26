package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you make per hour?");
        double hourlyRate=scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHours = scan.nextInt();

        System.out.println("How many hours do you work in a year?");
        int weeksInYear =scan.nextInt();

        double salary =hourlyRate*weeklyHours*weeksInYear;

        System.out.println("You are making $"+hourlyRate+ " per hour");
        System.out.println("You work "+weeklyHours+ " hours in a week");
        System.out.println("Your salary is $"+ salary);
    }
}
/*
ask the user enter:
     1.how much do you make per hour
     2.how many hours do you work in a week
     3.how many weeks do you work in a year

 */