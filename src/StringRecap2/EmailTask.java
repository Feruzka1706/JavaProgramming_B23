package StringRecap2;

public class EmailTask {
    public static void main(String[] args) {
    String email="Mohammed_Boghdadi@gmail.com";
    int indexOf_=email.indexOf("_");
    //returns the index of under score (_) from email
    int indexOfAt=email.indexOf("@");
    //returns the index number of@ from email
    
    String firstName=email.substring(0,indexOf_);
    String lastname =email.substring(indexOf_+1, indexOfAt);
    //it gives us the first char of last name

        System.out.println("firstName = " + firstName);
        System.out.println("lastname = " + lastname);
    }
}
/*
EmailTask1:
			Assume that email address is constructed by person's first name and followed by an underscore and last name.
			Write a program that can swap first name with last name in the email (Seperated by an underscore).
			If the email doesn't contain an underscore print the given input email.

			Ex:
				input: mike_tyson@gmail.com
				output: tyson_mike@gmail.com
 */