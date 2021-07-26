package Day15_String;

public class SubstringMethods {
    public static void main(String[] args) {
        String sentence = "Java programming language";
        // index:          0123
        String name =sentence.substring(0, 3+1);//Jav

        System.out.println(name);

        String s2="Cybertek School";
        //         012345678
        String name2=s2.substring(0,8);
        System.out.println(name2);

        String name3=s2.substring(9);// or 9, 14+1;
        // only for the last word we can use only one beginning index for printing the last word
        System.out.println(name3);

        System.out.println("------------------------------------");
        String sentence2 = "Java is a programming language";
        //                  012345678910
        String name4=sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10, 21);//or 10, 20+1;
        System.out.println(name5);
    }
}
