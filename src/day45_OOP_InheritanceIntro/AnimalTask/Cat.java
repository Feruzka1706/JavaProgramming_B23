package day45_OOP_InheritanceIntro.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void meow(){
        System.out.println(name+" meowing");
    }
}
