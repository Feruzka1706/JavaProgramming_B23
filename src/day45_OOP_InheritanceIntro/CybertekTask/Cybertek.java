package day45_OOP_InheritanceIntro.CybertekTask;

public class Cybertek {

    public String name;
    public int age;
    public char gender;
    public String department;
    public String jobTitle;
    public boolean fullTime;

    public void setInfo(String name, int age, char gender, String department, String jobTitle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public void supportStudents(){
        System.out.println(name+" always help students' support");
    }

    public void professional(){
        System.out.println(name+" professional with his/her job");
    }

    public void hardworking(){
        System.out.println(name+" works hard all the time");
    }

    public String toString() {
        return "Cybertek{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", fullTime=" + fullTime +
                '}';
    }
}
