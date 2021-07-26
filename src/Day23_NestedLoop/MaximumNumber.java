package Day23_NestedLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers={10,5,4,400,50,0,-1,569};
        int maxNumber=numbers[0];//400

        for (int i = 0; i <=numbers.length-1; i++) {
            int each=numbers[i];
            if(each>maxNumber){//if any greater number is occurred
                maxNumber=each;
            }
        }
        System.out.println(maxNumber);

    }
}
/*
write a program that can find the maximum number from an array of integers

      ex:
          array={10,5,4,400,50,0,-1};

          output:400;
 */