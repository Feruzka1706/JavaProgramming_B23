package Day21_LoopsContinue;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int i =1;
    // for loop is more clear for these kind of tasks

        while(i<=10){
            if(i%2==0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int j = 1; j <=10 ; j++) {
            if(i%2==0){
                System.out.print(j+" ");
            }
        }

    }
}
/*
ask user to enter numbers between 1-100 and print only EVEN numbers
      input:100
      output:
            2,4,6,8,10,12,........100
 */