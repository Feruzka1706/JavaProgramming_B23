package day45_OOP_InheritanceIntro.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" creating new communication application for Cybertek");
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }



}
