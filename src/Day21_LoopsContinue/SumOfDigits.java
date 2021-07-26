package Day21_LoopsContinue;

public class SumOfDigits {
    public static void main(String[] args) {
        String input ="A1B2C3";
        int sum=0;
        //digits: 1  2  3
        //        49 50 51 =150
        //       (49-48)=1 (50-48)=2 (51-48)=3
        for (int i = 0; i <=input.length()-1; i++) {//i: each index numbers of input
             char each=input.charAt(i);
            System.out.println(each);

            if(each>='0'&& each<='9'){
                sum+=each-48;//from ascii table which is '0'==48 in ascii table
                //in order to convert character to digit to integer number
            }
        }

        System.out.println("sum = " + sum);
    }
}
/*
Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
 */