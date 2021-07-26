package Day26_MultiDimensionalArray;

public class Max_Min_Numbers {
    public static void main(String[] args) {

        int[][] numbers={{10,20,30},{40,50,60,70,80}};
        //                  0              1

        int maxNum=numbers[0][0];//10
        int minNum=numbers[0][0];
        int sum=0;
        int count=0;//how many elements in the 2 dimensional array

        for(int[] arrEach:numbers) {//arrEach: each of the single dimensional arrays in 2 dimensional array

            for(int elemenent:arrEach){
                count++;
                sum+=elemenent;
                if(elemenent>maxNum){
                    maxNum=elemenent;
                }
                if(elemenent<minNum){
                    minNum=elemenent;
                }
            }
        }

        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);
        System.out.println("sum = " + sum);
        System.out.println("Average = "+((double)sum/count));



    }
}
/*
write a program that can find the maximum & minimum number from any two dimensional array
                {{10,20,30},{40,50,60,70,80}};
                max: 80
                min: 10


 */