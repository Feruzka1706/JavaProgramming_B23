package day07_Shorthands;

public class EligibleForLoan {
    public static void main(String[] args) {
      String name = "Feruza Jonzokova";
      int age = 28;
      int workHistory = 3;
      int creditScore = 760;
      double income = 30000;

      boolean eligibleForLoan = age >= 18 && creditScore >= 700 && income>= 60000 && workHistory >= 2;
                               // 28>= 18  &&  760      >= 760 && 30000 >= 60000 && 3  >= 2
                              // true    &&  true              &&  false         &&    true


        // in order to be eligible for load age must be at least 18 AND work history at be 2 years AND....

        System.out.println(name+ " is eligible for Loan: "+ eligibleForLoan);




    }
}
/*
Requirements for Loan:
EligileForLoan
            income has to be at least 60k
            at least have 2 years of work history
            at least have 700 of credit score
            at least 18 years old

        variables:    name, age, workHistory, creditScore, income
 */