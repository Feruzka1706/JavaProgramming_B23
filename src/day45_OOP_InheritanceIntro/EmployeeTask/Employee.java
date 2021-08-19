package day45_OOP_InheritanceIntro.EmployeeTask;

public class Employee extends Person {// employee IS a Person
    public long id;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+" working");
    }

    public void attendMeeting(){
        System.out.println(name+" is attending meeting");
    }


    public String toString() {
        return "Employee{" +
                "id= " + id +
                ", jobTitle=' " + jobTitle + '\'' +
                ", salary= $" + salary +
                ", name=' " + name + '\'' +
                ", age=" + age +
                ", gender= " + gender +
                '}';
    }
}
