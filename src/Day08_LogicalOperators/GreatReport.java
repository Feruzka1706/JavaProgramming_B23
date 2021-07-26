package Day08_LogicalOperators;

public class GreatReport {
    public static void main(String[] args) {
        int score = 59;

        if(score >= 90 && score <= 100){//90,91,92...100
            System.out.println("Excellent, You made an A");
        }
        if(score >=80 && score <=89){//80,81,82....89
            System.out.println("Good job, You made a B");
        }
        if(score >=70 && score <=79){//70, 71, 72...79
            System.out.println("You got a C");
        }

        if(score >= 60 && score <=69){//if score is between 60 and 69
            System.out.println("You made D");
        }

        if(score <60){//if score is less than 60
            System.out.println("You failed");
        }
    }
}
/*
score

grade:
A: 90<= score <= 100
B: 80<= score <= 89
C: 70 <= score <= 79
D:60 <= score <= 69
F:score <60
 */