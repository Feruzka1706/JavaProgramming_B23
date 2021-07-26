package day07_Shorthands;

public class SwipeVariables {
    public static void main(String[] args) {
       int a =20;
       int b =30;
       // we need only three variables to change this process
       int c = a;//20
        // we need to keep one more data type to memorize a original value here
        // it's a interview question!!!!!!!

       a = b; // a = 30
       b = c;// b = 20

        System.out.println("a = " + a);//30
        System.out.println("b = " + b);//20


        int num1 = 50;
        int num2 = 40;

        int num3= num1;
        num1=num2;
        num2=num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        String name ="Maftuna";
        String name2 = "Maria";

        String name3=name;
         name =name2;
         name2 =name3;

        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);



        //num1=40
        //num2=50


    }
}
/*
write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10


 */