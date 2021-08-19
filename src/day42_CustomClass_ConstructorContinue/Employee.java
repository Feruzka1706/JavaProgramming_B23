package day42_CustomClass_ConstructorContinue;

public class Employee {
    public String name;
    public String jobTitle;
    public int ID;
    public double salary;



    public Employee(String name) {
        this.name = name;

    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int ID) {
        this(name, jobTitle);
        this.ID = ID;
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this(name, jobTitle, ID);
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary= $" + salary +
                '}';
    }
}
/*
Task:
	1. Class Name: Employee
			instance variables:
					name, jobTitle, id, salary

			1st constructor: initializes the name ONLY

			2nd constructor: initializes name & jobTitle
						(MUST use constructor call to set the name)

			3rd Constructor: initializes name, jobTitle and id
						(MUST use constructor call to set the name & jobTitle)

			4th Constructor: initializes all the instances
						(MUST use constructor call to set the name, jobTitle, and id)

			instance methods: toString()

 */