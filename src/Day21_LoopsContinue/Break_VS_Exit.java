package Day21_LoopsContinue;

public class Break_VS_Exit {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            if(i==3){
                //break;//exits the loop ONLY
                System.exit(0);//terminates the system
                //after this it will not print
            }
            System.out.println("Cybertek School");
        }
        System.out.println("Batch 23");
    }
}
