package day30_Recap;

public class WhileLoopReview2 {
    public static void main(String[] args) {
        String sentence="I love Java, Java is fun";//"Java"
        String word="Java";
        int count=0;

        while(sentence.contains(word)){
            //it will stop if the sentence doesn't contain the word any more
           sentence=sentence.replaceFirst(word,"");
           //replaceFirst method replaces the first matching word from the sentence
           count++;
        }
    }
}
