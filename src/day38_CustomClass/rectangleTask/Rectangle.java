package day38_CustomClass.rectangleTask;

public class Rectangle {

    public double length, width;

    public void setInfo(double length, double width){
        this.length =length;
        this.width=width;
        //we use keyword "THIS" when we have the same name of atributes and parameters

    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }




    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area= "+calculateArea()+
                ", perimeter= "+calculatePerimeter()+
                '}';
    }
}
/*
create a custom class named Rectangle
    Attributes:
        length, width

    Actions:
        setInfo: sets the length and width of the rectangle
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        getInfo(): prints the width, length, area and perimeter of the rectangle

 */