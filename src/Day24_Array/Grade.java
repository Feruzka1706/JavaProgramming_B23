package Day24_Array;

public class Grade {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countF=0;

        int sum=0;

        for (int i = 0; i < grades.length ; i++) {
           //sum+=i;
            //int score = scores[i];
            if (scores[i] >= 90) {
                grades[i] = 'A';
                countA++;
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
                countB++;
            } else if (scores[i] >= 70) {//if scores>=75
                grades[i] = 'C';
                countC++;
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
                countD++;
            } else {//scores[i]
                grades[i] = 'F';
                countF++;
            }


            //grades[i]=(scores[i] >= 90)? 'A' :(scores[i] >= 80)? 'B' :(scores[i] >= 70)?
                     //'C' :(scores[i] >= 60)? 'D': 'F';
         double avg = (double)sum/ grades.length;
            System.out.println(names[i]+" : "+scores[i]+" : "+grades[i]);
            System.out.println("countA = " + countA);
            System.out.println(avg);


        }


    }
}
/*
given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades

 */