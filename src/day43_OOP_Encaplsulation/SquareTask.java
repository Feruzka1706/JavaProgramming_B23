package day43_OOP_Encaplsulation;

public class SquareTask {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            return;
        }
        this.side = side;
    }

    public SquareTask(double side) {
       setSide(side);
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return side * 4;
    }

    public boolean equals(SquareTask square){
        return side == square.side;
    }

    public String toString() {
        return "SquareTask{" +
                "side= " + side +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                '}';
    }
}
/*
 create a class named Square
            private variables:
                side (double)

            Encapsulate All the private fields
                (side can not be set to negative)

            Add a constructor that can set the instances when the object is created
                (avoid any duplicated code fragments)

            Extra methods:
                area(), perimeter(), toString(), equals()

 */