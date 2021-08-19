package day39_Staticvariables_Methods;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost() {
        if (isPersian) {//Turkey
            return 200 + (width * length) * unitPrice;
        }
        return (width * length) * unitPrice;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Carpet{" +
                "width= " + width +
                ", length= " + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian= " + isPersian +
                ", total price= $" + df.format(calCost()) +
                '}';
    }

}

public class CarpetTask {

    public static void main(String[] args) {

        // Carpet[] carpets ={new Carpet(), new Carpet(), new Carpet(),
        //new Carpet(), new Carpet()};

        day38_CustomClass.carpetTask.Carpet carpet1=new day38_CustomClass.carpetTask.Carpet();
        carpet1.customOrder(20,30,40, false);
        day38_CustomClass.carpetTask.Carpet carpet2=new day38_CustomClass.carpetTask.Carpet();
        carpet2.customOrder(30,20,40,true);
        day38_CustomClass.carpetTask.Carpet carpet3=new day38_CustomClass.carpetTask.Carpet();
        carpet3.customOrder(4,5,10,true);
        day38_CustomClass.carpetTask.Carpet carpet4=new day38_CustomClass.carpetTask.Carpet();
        carpet4.customOrder(10,15,30,false);
        day38_CustomClass.carpetTask.Carpet carpet5=new day38_CustomClass.carpetTask.Carpet();
        carpet5.customOrder(11,37,29,true);
        day38_CustomClass.carpetTask.Carpet[] carpets ={carpet1,carpet2,carpet3,carpet4,carpet5};

        ArrayList<day38_CustomClass.carpetTask.Carpet> persianCarpet =new ArrayList<>( );

        persianCarpet.addAll(Arrays.asList(carpets) );
        //adding all carpets inside arrayList
        persianCarpet.removeIf(each->  !each.isPersian);
        //removing all carpets which are not persian type

        ArrayList<day38_CustomClass.carpetTask.Carpet> regularCarpet=new ArrayList<>();
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

        for(day38_CustomClass.carpetTask.Carpet each: persianCarpet){
            System.out.println(each);
        }
        System.out.println("------------------------------------------------------");

        System.out.println(regularCarpet);


    }


}
