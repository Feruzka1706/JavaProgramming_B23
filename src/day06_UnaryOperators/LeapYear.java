package day06_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear = year % 4 == 0;
        // for year to check the year is leap year or not we gonna devise only to 4;
        System.out.println("Year "+year + " is a leap year: "+isLeapYear);


    }
}
/*
create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
        2012,2020,200...
        2012/4==>503
        remainder: 2012 - (4 * 53 ) = 0

        2013/4==>503
        remainder: 2013%4==>1

        year%4 ==0
 */