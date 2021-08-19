package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogsInfo10 {
   public String name;
   public String breed;
   public String size;
   public String gender;
   public int age;
   public String color;

    public static void main(String[] args) {
        DogsInfo10 dog1 =new DogsInfo10();
        dog1.setInfo("Simba", "Husky","large","male",3,"brown");

        DogsInfo10 dog2 =new DogsInfo10();
        dog2.setInfo("Reks", "Retriver","large","female",5,"black");

        DogsInfo10 dog3 =new DogsInfo10();
        dog3.setInfo("Jack", "French bulldog","large","male",2,"white");

        DogsInfo10 dog4 =new DogsInfo10();
        dog4.setInfo("Reks", "Husky","medium","female",4,"blue");

        DogsInfo10 dog5 =new DogsInfo10();
        dog5.setInfo("Tom", "Husky","large","male",6,"golden yellow");

        DogsInfo10 dog6 =new DogsInfo10();
        dog6.setInfo("Lucy", "Pitbull","large","male",3,"brown");

        DogsInfo10 dog7 =new DogsInfo10();
        dog7.setInfo("Mike", "Chihuahua","tiny","male",8,"brown");

        DogsInfo10 dog8 =new DogsInfo10();
        dog8.setInfo("Kangal", "Labarador","large","male",2,"brown");

        DogsInfo10 dog9 =new DogsInfo10();
        dog9.setInfo("Shrek", "Mops","small","female",7,"white- black");

        DogsInfo10 dog10 =new DogsInfo10();
        dog10.setInfo("Bussy", "Alabay","large","male",1,"white");


        ArrayList<DogsInfo10> dogs =new ArrayList<>(Arrays.asList(dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8,dog9,dog10));
        dogs.removeIf(p-> p.breed !="Husky");

        for(DogsInfo10 each: dogs){
           each.getInfo();
        }

    }

   public void setInfo(String dogName, String dogType,String dogSize, String dogGender,int dogAge, String dogColor){
       name=dogName;
       breed=dogType;
       size=dogSize;
       gender=dogGender;
       age=dogAge;
       color=dogColor;
   }

   public void getInfo(){
       System.out.println("name = " + name);
       System.out.println("breed = " + breed);
       System.out.println("size = " + size);
       System.out.println("gender = " + gender);
       System.out.println("age = " + age);
       System.out.println("color = " + color);
   }
}
/*
 create 10 objects of the Dog and set their Info
   create an ArrayList named dogs and add those 10 dog objects
   write a program that can remove all the dogs that are not husky
 */