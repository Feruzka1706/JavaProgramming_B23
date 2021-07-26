package day25_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,100,200,300,400,500,600},
              arr2 ={5,6,1000,2000,3000,400,5000,8000,9000};

        int[] arr3=new int[arr1.length+ arr2.length];
        //{0,0,0,0,0,0}
        //making sure that arr3 has enough capacity to contain the elements

        int j=0;//for the index numbers of third array

        for (int i = 0; i < arr1.length; i++) {//for arr1
            arr3[j++]=arr1[i];//retrives each element from arr1 and assigns to the index of arr3
        }

        for (int i = 0; i < arr2.length ; i++) {//for arr2
            arr3[j++]=arr2[i];
            //retrives each element from arr2 and assigns to the indexes of arr3
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------");

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int countOdd=0,
                countEven=0;

        for (int number : numbers) {//number: each element in array numbers
            if(number%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);

        System.out.println("----------------------------------");

        int[] a1 ={1,2,3,4};
        String[] s1={"A","B"};



    }
}
/*
 write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */