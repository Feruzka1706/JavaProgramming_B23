package day04_Variables;

public class ConcatenationPractice {

    public static void main(String[] args) {
        /*
          +:
             addition:when we have two numbers
                 10 + 10 = 20
            concatenation: when there is at least oen string
                "10" + "10" = "1010"
                1 + "10" = "110
                "2" + 3 = 23
         */
         String word = "Java";
        System.out.println("My favorite language is "+ word+ " programming language");
        System.out.println("------------------------------------");

        int dollar = 10000;
        double lira = dollar * 8.3;
        double euro = dollar * 0.9;

        System.out.println(dollar+ " US dollars equal to "+ lira+ " Turkish lira");
        System.out.println(dollar+ " US dollars equal to "+ euro+ " euros");

        System.out.println("--------------------------------------");
        int a = 100;
        int b = 200;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a*b;
        // 10 + 20 = 30 addition

        System.out.println(a + " + " + b + " = " + addition);

        // 10 - 20 = -10
        System.out.println(a+ " - " + b + " = " + subtraction);

        //100 * 200 = 20000
        System.out.println(a+ " * " + b + " = " + multiplication);

        System.out.println("-------------------------------");


        String name = "Feruza";
        String favouriteMusic = "Kygo's songs";
        String favouriteBook = "How to survive from Java";
        String favouriteSeries = "The Queen's Gambit";

        System.out.println("\tHello my name is "+ name+ "\n my favorite music is \""
                + favouriteMusic+ "\", my favorite book is \"" +favouriteBook
                + "\"\n my favorite TV series is \"" + favouriteSeries + "\"");

        System.out.println("---------------------------------------");
        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";

        System.out.println("Today is " + today + ", today we have "+ todayClass + " class.");
        System.out.println("Tomorrow is " + tomorrow+ ", tomorrow we have "+ tomorrowClass+ " class");

    }
}
