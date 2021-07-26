package day30_Recap;

public class BranchingStatements {
    public static void main(String[] args) {
        //As long as we have loop we can use branch statements

        for (int i = 0; i <=5; i++) {
            if(i==3){
                break;//exits the loop only
               // return;//exits the method
                //continue;//skips the current iteration
            }
            System.out.println(i+" ");
        }

        System.out.println("Hello Everyone");
    }
}
