package day29_ReturnMethods;

public class PrintingFormattingName {
    public static void main(String[] args) {


        formatFullName("cyBERtek", "scHOol");
    }

    public static void formatFullName(String firstName, String lastName){

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+"  "+lastName);
    }

}
/*
create a function that can print out the full name of a person in regular format
	            ex:
	               fullName("cYbErTeK", "SCHOOL");

	                output:
	                    "Cybertek School"

 */