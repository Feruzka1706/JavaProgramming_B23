package day38_CustomClass.carpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {

       // Carpet[] carpets ={new Carpet(), new Carpet(), new Carpet(),
                 //new Carpet(), new Carpet()};

        Carpet carpet1=new Carpet();
        carpet1.customOrder(20,30,40, false);
        Carpet carpet2=new Carpet();
        carpet2.customOrder(30,20,40,true);
        Carpet carpet3=new Carpet();
        carpet3.customOrder(4,5,10,true);
        Carpet carpet4=new Carpet();
        carpet4.customOrder(10,15,30,false);
        Carpet carpet5=new Carpet();
        carpet5.customOrder(11,37,29,true);
        Carpet[] carpets ={carpet1,carpet2,carpet3,carpet4,carpet5};

        ArrayList<Carpet> persianCarpet =new ArrayList<>( );

        persianCarpet.addAll(Arrays.asList(carpets) );
        //adding all carpets inside arrayList
        persianCarpet.removeIf(each->  !each.isPersian);
        //removing all carpets which are not persian type

        ArrayList<Carpet> regularCarpet=new ArrayList<>();
        regularCarpet.addAll(Arrays.asList(carpets));
       /*
        for(Carpet each: carpets){
            if(each.isPersian){
                persianCarpet.add(each);
            }else {
                regularCarpet.add(each);
            }
        }

        */

       for(Carpet each: persianCarpet){
           System.out.println(each);
       }
        System.out.println("------------------------------------------------------");

        System.out.println(regularCarpet);


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