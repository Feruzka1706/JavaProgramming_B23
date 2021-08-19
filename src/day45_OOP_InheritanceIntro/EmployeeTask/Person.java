package day45_OOP_InheritanceIntro.EmployeeTask;

public class Person {

    public String name;
    public int age;
    public final char gender;



    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
/*
Attributes:
            name, age, gender, position, companyName, salary
            works(), getPayCheck(), vacation()
 */