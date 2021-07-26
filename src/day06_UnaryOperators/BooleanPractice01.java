package day06_UnaryOperators;

public class BooleanPractice01 {
    public static void main(String[] args) {

       int num1 = 566;
       int num2 = 90;
       boolean isEvenlyDivisible = num1%num2 ==0;

        System.out.println("Is number divisible by "+ num2+": "+ isEvenlyDivisible);

        System.out.println("-------------------------");

        int num3 = 48;
        int num4 = 18;
        boolean divisibleNumber = num3%num4 ==0;
        System.out.println(num3+ " is divisibleNumber by " + num4 + " = " + divisibleNumber);

        //48-(18*2)=      48/18=2    18*2=36   48-36=12

        /*
        a-(b*c)=
        566/90=6   90*6=540  566-540=26




        //90*476=45
        //45-45=0

         */


    }
}
