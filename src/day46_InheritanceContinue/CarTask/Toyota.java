package day46_InheritanceContinue.CarTask;

public class Toyota extends Car {

     public static boolean isReliable=true;

     static {
         isReliable=true;
     }

    public Toyota( String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);
    }




}
