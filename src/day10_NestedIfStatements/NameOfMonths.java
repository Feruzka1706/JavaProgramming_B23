package day10_NestedIfStatements;

public class NameOfMonths {
    public static void main(String[] args) {
        int number = 6; //1-12
        String name = "";
        if (number >= 1 && number <= 12) {

            if (number == 1) {
                //System.out.println("Jan");
                name = "January";
            } else if (number == 2) {
                //System.out.println("February");
                name = "February";
            } else if (number == 3) {
                name = "March";
            } else if (number == 4) {
                name = "April";
            } else if (number == 5) {
                name = "May";
            } else if (number == 6) {
                name = "June";
            } else if (number == 7) {
                name = "July";
            } else if (number == 8) {
                name = "August";
            } else if (number == 9) {
                name = "September";
            } else if (number == 10) {
                name = "October";
            } else if (number == 11) {
                name = "November";
            } else {
                name= "December";
            }

            System.out.println(name);
            
        } else {
            System.out.println("Are you serious?? We don't have any other month after December idiot!");
        }
    }
}
