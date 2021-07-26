package Day23_NestedLoop;

public class MinumumNumber {
    public static void main(String[] args) {

        int[] numbers ={10,5,4,400,50,0,-1,-100};
        int minimumNum=numbers[0];//-100

        for (int i = 0; i <=numbers.length-1 ; i++) {
            if(numbers[i]<minimumNum){
                minimumNum=numbers[i];
            }
        }
        System.out.println(minimumNum);
    }
}
/*
write a program that can find the minimum number from an array of integers
     ex:
         array={10,5,4,400,50,0,-1};
         output:-1;
 */