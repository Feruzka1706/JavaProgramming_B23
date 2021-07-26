package Day17_StringRecap;

public class NewStringMethods {
    public static void main(String[] args) {
        String sentence = "My favorite programming languages are: C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava=sentence.contains("Java");

        System.out.println("hasPython = " + hasPython);//false
        System.out.println("hasJava = " + hasJava);//true

        System.out.println("--------------------------------------------");
        String sentence2="Cybertek School is the best";
        boolean startsWithCybertek=sentence2.startsWith("Cybertek");
        boolean startwithSchool=sentence2.startsWith("School");

        System.out.println("startsWithCybertek = " + startsWithCybertek);
        System.out.println("startwithSchool = " + startwithSchool);


        System.out.println("----------------------------------");
        boolean endsWithBest=sentence2.endsWith("best");//true

    }
}
