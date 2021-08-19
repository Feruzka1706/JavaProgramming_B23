package day46_InheritanceContinue.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Circle circle=new Circle(3);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle);

        System.out.println("=================================================================");

        Rectangle rectangle =new Rectangle(3.5,4.7);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        System.out.println("=======================================");
        Square square=new Square(5);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square);





    }
}
