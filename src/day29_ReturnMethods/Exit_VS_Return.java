package day29_ReturnMethods;

public class Exit_VS_Return {
    public static void main(String[] args) {
    passOrFailed(150);

        System.out.println("Test Completed");
    }


    public static void passOrFailed(int score){

        if(score<0 || score>100) {
            System.out.println("Invalid");
            return;
            //it will return the invalid message and will stop
            //System.exit(0); //terminates everything

        }
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

    }
}
