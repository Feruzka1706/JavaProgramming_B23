package Day08_LogicalOperators;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        String name = "Muhtar";
        int score = 60;
        boolean passed = score >= 60;
        //this one is reusable statement

        if(score >= 60){ //if student passed the exam
            System.out.println("Congrats "+name+", you passed the exam");
            //no output will come if the statement is not true
        }
        if (!passed){//if student failed the exam
            System.out.println(name+", you failed the exam");
            // no output will come if the statement is not true
        }



    }
}
