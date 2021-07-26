package day10_NestedIfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary =80_0000;
        double taxRate=0;

        if(salary>= 130000){//false salary<130k
            taxRate=0.35;
        }else if(salary>=100000){//false if salary is <100k
            taxRate=0.30;
        }else if(salary>=80000){//false if salary is <80k
            taxRate=0.25;
        }else{//salary<80k
            taxRate=0.20;
        }

        boolean isMarried=false;

        if(isMarried){//if person is married
            taxRate -=0.05;//tax rate will be subtracted by 5
        }//tax rate=15%
        double salaryAfterTax= salary-(salary*taxRate);


        System.out.println("Salary After Tax = "+salaryAfterTax);

    }
}
/*
Write a program that can calculate the salary after
 tax based on the following requirements.

                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married,
                 he/she will pay 5% less tax, otherwise pays 5% extra tax

 */