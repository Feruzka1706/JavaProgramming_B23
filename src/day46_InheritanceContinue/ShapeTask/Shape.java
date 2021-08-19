package day46_InheritanceContinue.ShapeTask;

public class Shape {

    private  final String name;
    public  static final boolean isShape, hasArea, hasPerimeter;

    static {
        isShape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public double area(){
        return 0; //depends on type of shape we can override the method and calculate the shape and can return
    }

    public double perimeter(){ //depends on type of shape we can override the method and calculate the shape and can return
        return 0;
    }

    @Override
    public String toString() {
        return
                ", area= " + area() +
                ", perimeter= " + perimeter();

    }
}
/*
shapeTask
        1. create a class called Shape
                        variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)

                        add a constructor that can set all the fields

                        methods: calcArea(), calcPerimeter(),
                                 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()

        2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square

             give the instance variables that are needed to calculate the Area, perimeter, of those shapes

 */