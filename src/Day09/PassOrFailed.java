package Day09;

public class PassOrFailed {
    public static void main(String[] args) {

        int score =50;

        if(score >= 60){
            System.out.println("Passed");
        }
        if(score<=60){
            System.out.println("Failed");
        }
        System.out.println("---------------------------------------------");


        if(score>=60){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }//when we have two possibility only

    }
}
