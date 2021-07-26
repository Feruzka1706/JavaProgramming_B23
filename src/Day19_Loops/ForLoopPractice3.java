package Day19_Loops;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            System.out.println("Push Up "+i);
        }

        System.out.println();
        System.out.println("----------------");

        for (int i = 1; i <= 8; i++) {
            System.out.println("\t\t\t* * * * * * ");
        }
        /*
        print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

         */

        System.out.println("---------------------------------");
        /*
         print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat
         */
        System.out.println("\t\t* * * * * *");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("\t\t*         *");
        }
        System.out.println("\t\t* * * * * *");
    }
}
