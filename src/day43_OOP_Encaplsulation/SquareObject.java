package day43_OOP_Encaplsulation;

public class SquareObject {
    public static void main(String[] args) {
        SquareTask square =new SquareTask(4.5);
        square.area();
        square.perimeter();

        System.out.println(square);
        SquareTask square2=new SquareTask(4.5);
        System.out.println(square.equals(square2));



    }
}
