package day43_OOP_Encaplsulation;

public class Circle {
    private double radius, diameter;

    private final static double PI=3.14;

   public double getRadius(){
       return radius;
   }

   public double getDiameter(){
       return diameter;
   }

   public void setRadius(double radius){

       if(radius < 0){
           System.out.println("Radius of circle cannot be negative numbers");
           return;
       }
       this.radius=radius;
       diameter=radius * 2;
   }

   public void setDiameter(double diameter){

       if(diameter<0){
           System.out.println("Diameter of circle cannot be negative numbers");
           return;
       }
       this.diameter=diameter;
       radius=diameter/2;
   }

    public Circle(double radius) {
        setRadius(radius);
        //this.radius=radius;
        //diameter=radius*2;
    }

    public double area(){
       return radius * radius * PI;
    }

    public double perimeter(){
       return diameter * PI;
    }

    public boolean equals(Circle circle){
       return radius ==circle.radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
/*
Task:
    1. Create a class named Circle
            Private variables:
                radius, diameter, PI

            generate getter & setter for all private fields
                    Make sure that radius & diameter of circle can never be set to negative

            add a constructor that can set all the fields

            Extra methods:
                equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
                calcArea(): returns the area
                calcPerimeter(): returns the perimeter
                toString()
 */