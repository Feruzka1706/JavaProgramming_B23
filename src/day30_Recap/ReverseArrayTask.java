package day30_Recap;

import java.util.Arrays;

public class ReverseArrayTask {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        //index:    0, 1, 2, 3, 4
        int[] result=new int[nums.length];//[50,40,30,20,10]
        //                                   0, 1, 2, 3, 4

        for (int i = nums.length-1, j=0; i>=0; i--) {
            //System.out.println(nums[i]);
            result[j++]=nums[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------------------------------------------");

        String[] group1={"Sophie","Feruza","Ekaterina"};
        String[] group2={"Shazia","Bilguun","Danka","Mucahit"};

        String[] group3=new String[group1.length+ group2.length];
        int k =0;
        for (int i = 0; i < group1.length ; i++) {
           group3[k++]=group1[i];
        }

        for (int j = 0; j < group2.length ; j++) {
            group3[k++]=group2[j];
        }

        System.out.println(Arrays.toString(group3));


    }
}
