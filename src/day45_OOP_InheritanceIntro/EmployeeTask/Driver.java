package day45_OOP_InheritanceIntro.EmployeeTask;

public class Driver extends Employee{//Driver Is an Employee,  driver Is a Person

    public Driver(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void drive(){

        System.out.println(name+" is driving");
    }
}
