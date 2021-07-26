package day06_UnaryOperators;

public class UnaryOperatorTask {
    public static void main(String[] args) {

        int a = 1;
        a= -a-- + a++ / -a-- * --a;
        System.out.println(a);
        System.out.println("----------------------------------");

        int num1 = 50;
        int num2 = 25;
        int num3 = num1++ - num2++;
        System.out.println(num3);
        System.out.println(num1);
        System.out.println(num2);
    }
}
