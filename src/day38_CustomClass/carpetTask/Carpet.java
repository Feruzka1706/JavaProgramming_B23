package day38_CustomClass.carpetTask;

import java.text.DecimalFormat;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost(){
        if(isPersian){//Turkey
            return 200 + (width*length)*unitPrice;
        }
        return (width*length)*unitPrice;
    }

    public String toString() {
        DecimalFormat df =new DecimalFormat("0.0");
        return "Carpet{" +
                "width= " + width +
                ", length= " + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian= " + isPersian +
                ", total price= $"+df.format(calCost() ) +
                '}';
    }
}
/*
create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice

        create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets


 */