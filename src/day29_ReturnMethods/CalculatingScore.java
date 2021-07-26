package day29_ReturnMethods;

public class CalculatingScore {
    public static void main(String[] args) {

       String result=grade2(95);
        System.out.println(result);
        //grade1(95);



    }


    public static void grade1(int score){
        if(score>100||score<0){
            System.out.println("Invalid score");
            return;
        }
        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }

    public static String grade2(int score){
     String result="";

     if(score>=0 && score<=100){
     /*
         if(score>=90){
             System.out.println("A");
         }else if(score>=80){
             System.out.println("B");
         }else if(score>=70){
             System.out.println("C");
         }else if(score>=60){
             System.out.println("D");
         }else{
             System.out.println("F");
         }

      */
         result=(score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)?
                                "D" : "F";

     }else{
         result="Invalid score number";
     }

     return result;
    }
}
