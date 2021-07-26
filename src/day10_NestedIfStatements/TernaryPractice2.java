package day10_NestedIfStatements;

public class TernaryPractice2 {
    public static void main(String[] args) {

       int number =100;



       /*String result ="";

       if(number>0){
           result="Positive";
       }else if(number<0){
           result="Negative";
       }else {
           result = "zero";
       }
     */

       String result =(number>0)? "Positive" :(number<0)? "Negative" : "Zero";

        System.out.println(number+" = is "+ result);


        System.out.println("-------------------------------");
        int score =100;
        char grade=' ';


    }
}
