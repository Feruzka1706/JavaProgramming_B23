package day10_NestedIfStatements;

public class EligibleToVoteTernary {
    public static void main(String[] args) {
        String name ="Feruza";
        int age =28;
        String citizen ="Uzbekistan";

        String eligibleToVote =(age>=18 && citizen=="US")? " is eligible to vote" :
                " is not eligible to vote";


        System.out.println(name+ eligibleToVote);

    }
}
