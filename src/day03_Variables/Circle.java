package day03_Variables;

public class Circle {
    public static void main(String[] args) {
      int r = 5;
      double pi = 3.14;

      double area = r * r * pi;
      double perimeter = 2 * r * pi;

        System.out.print("Area: ");// doesn't append new Line after printing
        System.out.println(area); // appends new line after printing

        System.out.print("Perimeter: ");// doesn't append new Line after printing
        System.out.println(perimeter);// appends new line after printing

    }

}
/* area of circle: r * r * 3.14
perimeter: 2 * r * 3.14
usually all requirements will be provided
in the future we use mostly only int and double
 */