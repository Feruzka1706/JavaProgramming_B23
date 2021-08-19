package day46_InheritanceContinue.ShapeTask;

public class Circle extends Shape {//Circle IS a Shape

    private double radius, diameter;
    private static final double PI=3.14;

    public Circle( double radius) {
        super("Circle");
       // this.radius = radius;
        setRadius(radius);
        //this.diameter = radius * 2;
        setDiameter(radius*2);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {
        if(radius<0){
            return;
        }
        this.radius = radius;
        diameter=2 * radius;
    }

    public void setDiameter(double diameter) {
        if(diameter<0){
            return;
        }
        this.diameter = diameter;
        radius=diameter/2;
    }

    public void calcArea(){
        System.out.println("Area of this circle is: "+radius* radius* PI);
    }

    @Override
    public double area() {
       return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                super.toString()+
                '}';
    }
}
