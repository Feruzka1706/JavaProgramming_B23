package day06_UnaryOperators;

public class LeapYear_Practice01 {
    public static void main(String[] args) {

        int oneYear= 12;
        boolean twelweMonth=oneYear%1 ==0;

        System.out.println("If one year is divided by "+twelweMonth);
        System.out.println("--------------------------------");

        int oneMonth=30;
        boolean thirtyDays = oneMonth%2 ==0;
        System.out.println("thirtyDays = " + thirtyDays);
    }
}
