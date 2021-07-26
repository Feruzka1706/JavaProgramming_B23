package day07_Shorthands;

public class EligibleToVote {
    public static void main(String[] args) {
       String name = "Aaron King";
       int age = 34;
       String citizen = "UK";
       int creditScore = 630;

       boolean eligibleToVote = age >= 18 && citizen =="USA" && creditScore == 700;
                                //34>= 18 && UK == USA
                                // true && false

        System.out.println(name + " is eleigible to vote for Biden: "+ eligibleToVote);


    }
}
/*
requirements to Vote
1.MUST be US citizen
2.At least 18 years old
3.Credit score must be 700

 */