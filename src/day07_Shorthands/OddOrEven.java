package day07_Shorthands;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 101;

        boolean even = number%2==0; //if this true then number is even
        boolean odd = number%2 != 0; //if theree is a remainder
                //even == false; // if the number is not even number, then it's odd number


        System.out.println(number+ " is even number: "+ even);
        System.out.println(number+ " is odd number: "+ odd);


    }
}
/*
boolean even = number%2==0;
boolean odd = number%2!=0;

System.out.println(number+ "is even" + even);
System.out.println(number+ " is odd"+ odd);
 */