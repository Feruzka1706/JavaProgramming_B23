package day10_NestedIfStatements;

public class Ternary {
    public static void main(String[] args) {
        int num =100;
        String result="";

        if(num%2==0){
            result="Even";
        }else{
            result="Odd";
        }
        System.out.println(result);


        System.out.println("------------------------------------");

        String result2 = (num%2==0)? "Even" : "Odd";
        //shortcut of if statement= ternary
        //In ternary we need always two conditions

        System.out.println(result2);










    }
}
