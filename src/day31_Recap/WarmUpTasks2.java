package day31_Recap;
import utilities.StringUtility;
public class WarmUpTasks2 {
    public static void main(String[] args) {

        String sentence="Java java JaVA";
        String word="java";

        int count=0;//==>3 occured Java in the sentence
        sentence=sentence.toLowerCase();//for ignore the case sensitivity
        word=word.toLowerCase();//for ignore the case sensitivity
        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);

        System.out.println("-----------------------------------------------------");
        String sentence2="Cybertek cybertek CYBerTeK, CYBERTEK";
        String word2="cybertek";

        int result=frequencyOfWord(sentence2,word2);
        System.out.println(result);

        System.out.println("-------------------------------------------------");

        String word3="Racecar";
        boolean isPalindrome=StringUtility.isPalindrome(word3);

        System.out.println(isPalindrome);

        System.out.println("-----------------------------------------------------");
        String str2="CCCYYYBBEERRTTEEEKKK";

        String result2=StringUtility.removeDup(str2);
        System.out.println(result2);


    }

    public static int frequencyOfWord (String sentence, String word){
        int count=0;//==>3 occured Java in the sentence
        sentence=sentence.toLowerCase();//for ignore the case sensitivity
        word=word.toLowerCase();//for ignore the case sensitivity
        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }

        return count;
    }
}
