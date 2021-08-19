package day37_CustomClass;

public class StudentInfo {
    public String name;
    public String gender;
    public int age;
    public String studentID;
    public String nationality;

    public static void main(String[] args) {
        StudentInfo student1=new StudentInfo();
        student1.setInfo("Nazli","female",30,"22nz278","Turkish");
        student1.getInfo();
        student1.eat("Turkish food");
        student1.sleep("only few hours a day");
        student1.codes("really good");
        student1.gitHub(false);
        student1.javaClass(true);
        System.out.println("--------------------------------------------------------------------------------------");

        StudentInfo student2=new StudentInfo();
        student2.setInfo("Ahmad","male",35,"12SA977","Afghan");
        student2.getInfo();
        student2.eat("Persian and Afghan food");
        student2.sleep("honestly don't know :))))");
        student2.codes("really good as he's is our group's PO :)");
        student2.gitHub(false);
        student2.javaClass(true);
        System.out.println("-----------------------------------------------------------------");
    }


    public void eat(String food){
        System.out.println(name+ " likes to eat "+food);
    }

    public void sleep(String frequency){
        System.out.println(name+" sleeps "+frequency);
    }

    public void codes (String howCodes){
        System.out.println(name+" codes with Java "+howCodes);
    }

    public void gitHub(boolean githubClass){
        System.out.println(name+" enjoys from GitHub class :)))) = "+githubClass);
    }
    public void javaClass(boolean javaClass){
        System.out.println(name+" loves Java class = "+javaClass);
    }

    public void setInfo(String studentName, String studentGender, int studentAge, String studentIdNum, String studentNationality){

        name=studentName;
        gender=studentGender;
        age=studentAge;
        studentID=studentIdNum;
        nationality=studentNationality;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("studentID = " + studentID);
        System.out.println("nationality = " + nationality);
    }

}
