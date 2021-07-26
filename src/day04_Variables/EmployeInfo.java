package day04_Variables;

public class EmployeInfo {
    public static void main(String[] args) {

        String firstName = "Christian";
        String lastName = "Cain";
        String gender = "Male";
        int age = 28;
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 110000;
        String fullName = firstName + " " + lastName;
        //Aron King
        //Employee' full name is: Aron King
        System.out.println("Employee' full name is: " + fullName);




        //Aron King is Male
        System.out.println(fullName+ " is " +gender);



        // fullName is age years old
        System.out.println(fullName+" is " +age + " years old");
        System.out.println(fullName+ " works at "+ companyName);

        //fullName' job title is jobTitle
        System.out.println(fullName+ "' job title is "+ jobTitle);

        //fullName isFullTime worker
        System.out.println(fullName + "is full time employee: "+ isFullTime);

        //fullName isMarried
        System.out.println(fullName+ " is Married: "+ isMarried);

        //fullName + salary
        System.out.println(fullName+ " is making $ " +salary);




    }
}
