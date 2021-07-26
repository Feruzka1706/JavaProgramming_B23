package Day23_NestedLoop;

import java.util.Scanner;

public class NameOfDays {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday",
                        "Saturday","Sunday"};
        //index:      0-6

        System.out.println("Enter a number:");
        int number=scan.nextInt();

        System.out.println(days[number-1]);
    }
}
