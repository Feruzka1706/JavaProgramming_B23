package Day08_LogicalOperators;

public class GradeReport2 {
    public static void main(String[] args) {
       int score = 50;
       boolean madeA = score>= 90 && score <=100;
       boolean madeB = !madeA && score >= 80;
       //did not make A and score is greater or equal to 80
        boolean madeC = !madeA && !madeB && score >= 70;
        //did not make A and B and score is greater or equal to 70
        boolean madeD = !madeA && !madeB && !madeC && score >= 60;
        //did not make A, B, C, and score is greater or equal to 60
        boolean madeF = !madeD && score < 60;
        //did not make A,B,C,D and score is below than 60

        if(madeA){
            System.out.println("You got A");
        }
        if(madeB){
            System.out.println("You got B");
        }
        if(madeC){
            System.out.println("You got C");
        }
        if(madeD){
            System.out.println("You got D");
        }
        if(madeF){
            System.out.println("You failed");
        }



    }
}
