package Day15_String;

public class StringIntro {
    public static void main(String[] args) {
        String str1="Cybertek";//Literal
        String str2= new String("Cybertek");//new keyword


        System.out.println("------------------------------------");

        String s1 ="Cat";
        String s2 = "CAt";
        String s3 = "Cat";//"Cat", "CAt"
        // string pool saved only one object and using the same object for other string variables
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true

        System.out.println("---------------------------------------");

        String s4 = new String("Dog");//one dog
        String s5 = new String("Dog");// another dog
        String s6 = new String("Dog");
        //different two objects here!
        String s7=s4;

        System.out.println(s4==s5);//false! different objects here
        System.out.println(s5==s6);//false!

        System.out.println(s7==s4);// true!
    }
}
