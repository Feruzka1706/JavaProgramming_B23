package day10_NestedIfStatements;

public class Finra {
    public static void main(String[] args) {
        int number =208;
        String answer="";


        if(number%3==0 && number%5==0){
            answer="FINRA";
        }else if(number%5==0){
            answer="RA";
        }else if (number%3==0){
            answer="FIN";
        }else{
            answer=""+number;// " " result

        }
        System.out.println("answer = " + answer);


        System.out.println("----------------------------------------------");


        int score=85;
        String grade="";  //

    }
}
/*
Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

            output:
                FIN

                number = 10

            output:
                RA

                number = 15

            output:
                FINRA
 */