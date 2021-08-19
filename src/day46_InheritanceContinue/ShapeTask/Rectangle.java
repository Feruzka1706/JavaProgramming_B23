package day46_InheritanceContinue.ShapeTask;

public class Rectangle extends Shape {

    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
       setWidth(width);
    }

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            //if the length of Rectangle equal or small than 0 we will exit the method
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            //if the width of Rectangle small or equal than 0 the method will be exit without action
            return;
        }
        this.width = width;
    }



    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (width + length) *2 ;
    }
}
