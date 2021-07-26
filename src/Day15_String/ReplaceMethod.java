package Day15_String;

public class ReplaceMethod {
    public static void main(String[] args) {
        String sentence = "Python is an easy language";
        sentence=sentence.replace("Python","Java");
        System.out.println(sentence);

        String sentence2="C# is a programming language, I like learning C#, C# is the best";
        sentence2=sentence2.replace("C#", "Java");
        System.out.println(sentence2);

        String sentence3="Dog is friendly, Dog is loyal, I love Dogs";
        sentence3=sentence3.replace("Dog", "Cat");
          System.out.println(sentence3);
        
        String sentence4= "I like to learn Python and HTML, Python and HTML are easy languages";
        sentence4=sentence4.replace("Python","Java")
                .replace("HTML","C#");


        System.out.println("sentence4 = " + sentence4);

        System.out.println("--------------------------------");
        String str="Batch 23";
        //index:    01234567
        char ch1=str.charAt(0);
        System.out.println("ch1 = " + ch1);
    }
}
