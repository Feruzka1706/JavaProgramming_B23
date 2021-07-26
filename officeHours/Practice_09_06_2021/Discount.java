package Practice_09_06_2021;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter quantity of your product ");
        int quantity=input.nextInt();

        double unitPrice=100;
        double totalCost=quantity*unitPrice;
        double discountRate=0.1;
        double totalDiscount=0;

        if(totalCost>1000){
            totalDiscount=discountRate*totalCost;
            System.out.println("You get a discount of "+ totalDiscount+ " and your total coast is " +
                    (totalCost-totalDiscount));
        }else{
            System.out.println("No discount applied");
        }
    }
}
/*
Task :         A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                            Suppose, one unit will cost 100.
                            Judge and print total cost for user.
                            ( Scanner Class can be used )

                            INPUT for quantity :  5
                             EXPECTED : No discount applied

                            INPUT for quantity  :  15
                            EXPECTED : You get a discount of $discount and your total cost is $totalCost





 */