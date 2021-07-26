package Practice_09_06_2021;

public class QualificationForArmy {
    public static void main(String[] args) {

        boolean isCitizenship=true;
        boolean isResident=true;
        boolean hasHighSchoolDiploma=true;

        int age =19;

        if(isCitizenship==true || isResident==true){
            System.out.println("You are qualified for the US Army");


             if(age>=18 && age<=35){
                 System.out.println("You are qualified for the US Army");


                 if(hasHighSchoolDiploma){
                     System.out.println("You are qualified for the US Army");
                 }else{
                     System.out.println("You must have High School Diploma");
                 }



             }else{
                 System.out.println("Your age is must be between 18 to 35");
             }



        }else{
            System.out.println("You must be a U.S citizen or a resident of U.S");
        }
    }
}
/*
 [Qualification For Army]

    Given information: citizenship(boolean), resident (boolean),
     and has high school diploma (boolean),
     and age(int). Determine if the person is qualified to join the army.

    - The person must be a Citizen of the USA or a resident
     -> If not print: You must be a U.S. citizen or a resident

    - Their age must be between 18 and 35
    -> If not print: Your age must be between 18 to 35 years old

     - They must have a high school diploma
     -> If not print: You must have a high school diploma

   If all the criteria is met print: You are qualified for the US Army

 */