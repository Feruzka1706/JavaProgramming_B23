package day05_ArithmeticOperators;

public class Birthday {

    public static void main(String[] args) {
        String name = "John",
                birthMonth = "May";
        int birthDay = 15,
                birthYear = 1993;

        System.out.println(name+ " was born "+ birthMonth+ "/"+ birthDay+ "/"+ birthYear+".");

        int age = 2021 - birthYear;
        // we gonna add new variable as age and = 2021 - person's birth  year

        System.out.println(name+ " is "+ age+ " years old.");


    }
}
/*
Create a class named BirthDay and create the following variable
        name, birthDay(int), birthMonth(String), birthYear(int)

        use concatenation to display the birthday of the person

        if  name = "John"
        birthDay = 25
        birthMonth = "April"
        birthYear = 1995;

        output:
        John was born on April/25/1995
 */