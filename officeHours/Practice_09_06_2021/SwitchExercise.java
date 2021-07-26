package Practice_09_06_2021;

public class SwitchExercise {
    public static void main(String[] args) {
        // we can't use with swithc boolean, long, double, float

       String animal="Human";
       String result="";

       switch (animal){
           default:
           result="Unknown animal";
           break;
           case "Dog":
           case "Cat":
               result="Domestic animal";
               break;
           case "Tiger":
               result="Wild animal";
               break;


       }

        System.out.println(result);

    }
}
/*
Create  a program that accepts animal as String

     DOG     - domestic animal
    CAT     - domestic animal
     TIGER     - wild  animal

    For other animal - unknown animal

                            INPUT : DOG
                           EXPECTED OUTPUT : DOG is domestic animal
 */