package Day08_LogicalOperators;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number = -20;
        boolean positive = number >0;
        boolean negative = number <0;
        boolean zero = !positive && !negative;

        if(positive){//it will if the number is positive
            System.out.println(number+ " is positive");
        }
        if(negative){//if the number is negative
            System.out.println(number+ " is negative");
        }

        if(zero){//if the number is zero
            System.out.println(number+ " is zero");
        }



        System.out.println((int)10.0/3);
    }
}
