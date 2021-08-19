package day43_OOP_Encaplsulation;

public class AccessModifiers {

    public static int publicVariable=100;
             static int defaultVariable=200;//for default access modifier: default
    //do not give any keyword for default access modifier

    private static int privateVariable=300;


    //protected static int protectedVariable=1000;

    public static void main(String[] args) {
        System.out.println(privateVariable);//private access modifier is reachable within the same class
        System.out.println(defaultVariable);//default access modifier is reachable within the same class
        System.out.println(publicVariable);//public access modifier is reachable within the same class

    }

}
