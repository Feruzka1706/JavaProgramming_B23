package Day23_NestedLoop;

public class HighestScore {
    public static void main(String[] args) {
        int[] scores={85,70,95,90,100};
        //            0, 1  2   3   4
        String[] names={"Mike","Adam","Tonny","John","Ammy"};

        int maxScore=scores[0];
        int minScore=scores[0];
        String maxName="";
        String minName="";

        for (int i = 0; i <= scores.length-1; i++) {
            String eachName=names[i];//gets each names from the array names
            int eachScore=scores[i];//gets each score from the array scores

            if(eachScore>maxScore){//used for comparing the scores to assign the maximum score to maxscore
                maxScore=eachScore;
                maxName=eachName;
            }

            if(eachScore<minScore){//used for comparing the scores to assign the minimum score to minScore
                minScore=eachScore;
                minName=eachName;
            }

        }

        System.out.println(maxName+" "+maxScore);
        System.out.println(minName+" "+minScore);


    }

}
