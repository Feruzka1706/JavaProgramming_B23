package day05_ArithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println( 25 / 2); //12 int result
        System.out.println( 25.0 / 2);// decimal result
        System.out.println( 25 / 2.0);// decimal result
        System.out.println( 25d / 2); // add d and compiler accept this as decimal
        // and result will be decimal

        //System.out.println(10 / 0);
        // not any number can't  be divide in Java

        int a = 100/3; //33.333... in math
        // but in Java we get 33 as int numbers
        System.out.println("a = " + a);

        double b = 100/3; // 33.0
        // b = 33.0
        System.out.println("b = "+ b);

        double c = 100.0/3;
        System.out.println("c = "+ c);

        System.out.println("----------------------------------------------");
        int n1 = 100;
        int n2 = 40;
        // 100/40==>20
        System.out.println(n1 % n2); //20

    }
}
