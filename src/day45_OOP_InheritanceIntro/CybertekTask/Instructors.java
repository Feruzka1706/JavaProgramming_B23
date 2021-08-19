package day45_OOP_InheritanceIntro.CybertekTask;

public class Instructors extends Cybertek {

    public String className;

   public Instructors(String name, int age, char gender,String department,String jobTitle,boolean fullTime,String className){
       setInfo(name, age, gender, department, jobTitle);

   }

   public void teaches(){
       System.out.println(name+" teaches from "+className);
   }

}
