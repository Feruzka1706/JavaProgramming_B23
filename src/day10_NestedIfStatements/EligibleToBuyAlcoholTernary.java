package day10_NestedIfStatements;

public class EligibleToBuyAlcoholTernary {
    public static void main(String[] args) {
        String name="John";
        int age =17;


        String buyingAlcohol = (age>=21)?" is eligible" : " is not Eligible";

        System.out.println(name+ buyingAlcohol);
    }
}
