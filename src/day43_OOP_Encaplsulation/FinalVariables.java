package day43_OOP_Encaplsulation;

import java.time.LocalDate;

public class FinalVariables {

    private final String gender ;
    private final LocalDate DOB;
    private double salary;

    public FinalVariables(String gender,LocalDate DOB){
        this.gender=gender;
        this.DOB=DOB;
    }


    public String getGender(){
        return gender;
    }
    /*

    public void setGender(String gender){
        this.gender=gender;
    }

     */

    public static void main(String[] args) {

        final  int a=100;
        int b =200;

        System.out.println(a);

    }
}
