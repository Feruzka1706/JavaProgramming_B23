package day42_CustomClass_ConstructorContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObjects {
    public static void main(String[] args) {

        ArrayList<Item> items =new ArrayList<>();

        items.addAll(Arrays.asList(
               new Item("milk",3.99,2), new Item("egg",4.99,1),
                new Item("bread",5.99,3), new Item("Soap", 2, 60),
                new Item("Tomato Sauce", 1.5, 140),new Item("Salsa Sauce", 1.7, 130),
                new Item("Cake", 3.5, 50),new Item("Turkish Delight", 3, 50),
                new Item("Gum", 2.2, 150), new Item("water",5.99,3)
        ));


       items.removeIf(item -> item.unitPrice>3);
        double totalPrice=0;
        
        for(Item eachItem: items){
            totalPrice+=eachItem.calCost();
        }

        System.out.println("totalPrice = " + totalPrice);
    }
}
