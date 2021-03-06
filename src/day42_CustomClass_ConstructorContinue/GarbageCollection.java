package day42_CustomClass_ConstructorContinue;

import day41_CustomClass_Constructor.circleTask.Circle;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        arr1 = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(arr1));


        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        list = new ArrayList<>(Arrays.asList("D", "E", "F"));

        System.out.println(list);

        System.out.println("----------------------------------------------------------------------");

        Employee employee1 = new Employee("Yasin");
        Employee employee2 = new Employee("Feruza");

        employee1 = employee2;

        System.out.println("-----------------------------------------------------------------");

        String s1 = "Napkins",
                s2 = "Paper Towels";

        s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("--------------------------------------------------------------------------");

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("BMW", "X5");

        car2 = new Car("Honda", "Civic");

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("=============================================================================");

        Circle circle1=new Circle(3);//eligible for garbage
        //circle1= null;  //new Circle(5);

        System.out.println(circle1.area() );//to us instance methods we MUST have object !

        System.out.println("========================================================================");

        String word="cybertek";
           word="Cybertek School";
        System.out.println(word.toUpperCase() );


    }
}
