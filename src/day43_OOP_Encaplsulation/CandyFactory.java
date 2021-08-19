package day43_OOP_Encaplsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {
        ArrayList<CandiesTask> candies=new ArrayList<>();
        candies.addAll(Arrays.asList(new CandiesTask("M & M chocolate",5,4.5,false),
        new CandiesTask("Snickers",30,5.0,true),
        new CandiesTask("Hersheys",25,18.90,false),
        new CandiesTask("Kirkland",1,30,false),
        new CandiesTask("Twix",15,10,false)
        ));

        CandiesTask candy=new CandiesTask("Chocolate",2,0,true);
        candy.setPrice(3.90);
        System.out.println(candy);
        for(CandiesTask eachCandy:candies){
            System.out.println(eachCandy.getBrand()+eachCandy.getPrice());
        }
    }
}
/*
 Create a class named CandyFactory
            Create an ArrayList of candies
            Add five objects of candies
            use for each loop to print the brand and price of each candy
 */