package Day09;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
       String name= "John";
        int age =30;

       if(age>= 21){
           System.out.println(name+ " is eligible");
       }else{//otherwise: age<21
           System.out.println(name+ " is not eligible");
       }


    }
}
