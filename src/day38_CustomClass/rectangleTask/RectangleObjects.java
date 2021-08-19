package day38_CustomClass.rectangleTask;

import day38_CustomClass.rectangleTask.Rectangle;

import java.util.Arrays;

public class RectangleObjects {
    public static void main(String[] args) {
        //w:20 , l:30

         Rectangle rectangle1 = new Rectangle();
         rectangle1.setInfo(30,20);


        System.out.println("-----------------------------------------------------------------");
        Rectangle rectangle2=new Rectangle();
        //l: 50, w:10
        rectangle2.setInfo(50,10);


        Rectangle rectangle3= new Rectangle();
        rectangle3.setInfo(2.6, 5.7);


        System.out.println("-----------------------------------------------");

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3);
       //it will give hash code  when we pass the object to print statement

        System.out.println("-------------------------------------");

        Rectangle[] arr={rectangle1,rectangle2,rectangle3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(Arrays.toString(arr));
    }
}
