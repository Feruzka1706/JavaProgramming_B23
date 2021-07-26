package day33_RecapMethods;

public class OverloadingMainMethod {

    public static void main(String[] args) {

        System.out.println("String");
    }

    public static void main(char[] args) {

        System.out.println("char");
    }

    public static void main(int[] args) {
        System.out.println("int");

    }

    /*
    main method can be overload also, but when there are more than one main methods
     only String main method will be run
     */


}
