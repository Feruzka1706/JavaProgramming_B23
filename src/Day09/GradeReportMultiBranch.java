package Day09;

public class GradeReportMultiBranch {
    public static void main(String[] args) {
        int score =110;

        if(score>=90 && score<=100){//false: score <90
            System.out.println("Grade is A");
        }else if (score>=80 && score<90){
            System.out.println("Grade is B");
        }else if (score>=70 && score<80) {
            System.out.println("Grade is C");
        }else if(score>=60 && score<70){
            System.out.println("Grade is D");
        }else{
            System.out.println("Failed");
        }




    }
}
