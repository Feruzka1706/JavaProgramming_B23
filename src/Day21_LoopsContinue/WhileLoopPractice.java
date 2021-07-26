package Day21_LoopsContinue;

public class WhileLoopPractice {
    public static void main(String[] args) {

        String sentence = "Java java JAVA JAvA";
        //                "Java Java Java"
        //                 "Java Java"
        //                  "Java"
        //                    ""

        int countWord=0;//1+1+1+1

        while(sentence.toLowerCase().contains("java")){
            countWord++;
            sentence=sentence.replaceFirst("java","");
        }

        System.out.println("countWord = " + countWord);


    }
}
