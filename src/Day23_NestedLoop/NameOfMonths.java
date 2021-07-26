package Day23_NestedLoop;

import java.util.Scanner;

public class NameOfMonths {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.println("Enter a number");
        int number=scan.nextInt();

        if(number>=1&&number<=12){
            System.out.println(months[number-1]);
        }else{
            System.out.println("Invalid number");
        }
        /*
        for (int i = 0; i <= months.length-1 ; i++) {
            System.out.println(months[i]);
        }
         */
      scan.close();

    }
}
