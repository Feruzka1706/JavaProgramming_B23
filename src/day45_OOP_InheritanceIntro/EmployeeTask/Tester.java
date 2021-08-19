package day45_OOP_InheritanceIntro.EmployeeTask;

public class Tester extends Employee {// Tester IS an Employee, Tester IS a Person

    public Tester(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void testing(){
        System.out.println(jobTitle+" "+name+" is finding defaults from Cybertek communication app Discord");
    }

/*
6 variables inherited from Employee
7 methods inherited from Employee
 */
}
