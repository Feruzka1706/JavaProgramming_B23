package Day15_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str= "Muhtar";

        char ch1=str.charAt(0);
        System.out.println("ch1 = " + ch1);

        String word ="Cybertek School";
        // index:     0123456789.....
        char ch2 = word.charAt(9);
        System.out.println("ch2 = " + ch2);

        String word2 = "Java";
        // index:      0123
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);

        System.out.println("-----------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars=sentence.length();

        System.out.println("totalNumberOfChars = " + totalNumberOfChars);


        System.out.println("----------------------------");
        String s="cybertek";
              // s = s.toUpperCase();//"CYBERTEK"
        System.out.println(s.toUpperCase());
        // the same result

        System.out.println("---------------------------");
        String s2 = "JAVA PROGRAMMING LANGUAGE";
        //s2=s2.toLowerCase();// "java programming language"
        System.out.println(s2.toLowerCase());


        String name = "feruza";
        name=name.toUpperCase();//"Feruza"
        System.out.println(name);

        name=name.toLowerCase();
        System.out.println(name);

        System.out.println("----------------------------------");
        String schoolName = "         Cybertek School class";
        schoolName=schoolName.trim();
        System.out.println(schoolName);

    }
}
