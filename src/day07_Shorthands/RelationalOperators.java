package day07_Shorthands;

public class RelationalOperators {
    public static void main(String[] args) {
        // > if the number on the right side is bigger than on the left side: true
        //>= if the number on the right is bigger or equal than ont the left side
        //> bigger , >=bigger or equal
        System.out.println( 10 > 11); //false
        System.out.println( 10 >= 10); //true

        System.out.println( 11 >= 9); //true
        System.out.println( 20 >= 200); // false

        //< smaller , <= smaller or equal
        System.out.println( 100 < 30); //false
        System.out.println( 30 <= 100); // true

        // == equal , != not equal
        System.out.println('a' == 'A'); //false
        System.out.println( 'a' != 'A'); //true

        System.out.println("java" == "Java");//false
        System.out.println("java" != "Java"); //true



    }
}
