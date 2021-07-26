package Day16_;

import com.sun.tools.corba.se.idl.StringGen;

public class StringMethods {
    public static void main(String[] args) {
        String email="Cybertek@yahoo.com";
        email=email.replace("yahoo","gmail");
        //Cybertek@gmail.com
        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        sentence=sentence.replaceFirst(", C#", ", Java");
        //replaces the first matching only

        System.out.println(sentence);

        String s ="Cat Dog Cat Dog Cat";

        s= s.replaceFirst("Cat", "Dog");
        System.out.println(s);


        System.out.println("---------------------------------");

        String sentence2 = "Java is a cool language";
        // index:           0123456789
        int indexOfFirst=sentence2.indexOf("a");
        int indexOfSecondA=sentence2.indexOf("a ");
        int indexOfThirdA=sentence2.indexOf("a c");
        int indexOfFourthA=sentence2.indexOf("an");//or ("la") +1'
        //int indexOfFifthA=sentence2.indexOf("ag");
        int indexOfFifthA=sentence2.lastIndexOf("a");

        System.out.println("indexOfFirst = " + indexOfFirst);
        System.out.println("indexOfSecondA = " + indexOfSecondA);
        System.out.println("indexOfThirdA = " + indexOfThirdA);
        System.out.println("indexOfFourthA = " + indexOfFourthA);
        System.out.println("indexOfFifthA = " + indexOfFifthA);


        System.out.println("-----------------____--------");

        String s2="      ";//space is also character
        s2=s2.trim();//""
        boolean r1 =s2.isEmpty();
        System.out.println("r1 = "+r1);

        System.out.println("-----------------------------------");
        // equals(), or equalsIgnoreCase()

        String str1 ="Cat";//string pool
        String str2 = new String("Cat");//Java Heap
        String str3 = new String("Cat");//Java Heap

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2) );//true

        System.out.println(str2==str3);//false
        System.out.println();



    }
}
