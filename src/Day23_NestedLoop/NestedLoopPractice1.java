package Day23_NestedLoop;

public class NestedLoopPractice1 {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <=20; j++) {
                System.out.print("*");
            }
            System.out.println();
            //appends new line after printing each 20 "*";
        }

        System.out.println("-------------------------------------");

        for (int j = 1; j <=8 ; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print("*");
                //i: number of * in each line
            }
            System.out.println();
            //make sure apply new line
        }


    }
}
