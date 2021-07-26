package day03_Variables;

public class Curriencies {

    public static void main(String[] args) {

        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar * 0.81;
        double sum = dollar * 10.611;
        double dinar = dollar * 1.463;
        double canadianDollar = dollar * 1.21;
        double ruble = dollar * 73.60;
        /*...*/

       /* System.out.print("Lira ");
        System.out.println(lira);
       shortcut for print variable: soutv
        */

        System.out.println("Lira = " + lira);
        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("sum = " + sum);
        System.out.println("dinar = " + dinar);
        System.out.println("canadianDollar = " + canadianDollar);
        System.out.println("ruble = " + ruble);

    }
}
/*
1 dollar = 8.41 lira;
1 dollar = 0.81 euro
1 dollar = 10.611 sum;
 */