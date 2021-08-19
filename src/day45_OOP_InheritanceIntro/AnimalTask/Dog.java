package day45_OOP_InheritanceIntro.AnimalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }// Dog is animal



    public void bark(){
        System.out.println(name+" is barking");
    }



}
/*
Attributes:
          name, breed, gender, size, age, color

          Actions:
                bark(), sleep(), eat(), drink(), toString()
 */