package day33_RecapMethods;

import java.util.Arrays;
import utilities.ArraysUtility;
public class WarmUpTask_0 {
    public static void main(String[] args) {

        int[] numbers={100,200,300,400,500,600};
        System.out.println(Arrays.toString(numbers));
        numbers=removeElement(numbers,3);//{100,200,300,500,600}
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------------------");
        double[] array1={6.5, 7.5, 8.5, 9.5}; //index 2
        array1=removeElement(array1,2);//{6.5, 7.5, 9.5}
        System.out.println(Arrays.toString(array1));

        System.out.println("------------------------------------------------------------------");

        String[] students={"Dilem", "Aysu", "Mucahit","Tugba","Fhilipp"}; //index 2
        students=removeElement(students,2);//Mucahit will be skipped
        System.out.println(Arrays.toString(students));

        students=removeElement(students,3);
        System.out.println(Arrays.toString(students));


        System.out.println("------------------------------------------------------------------");

        char[] chars1={'A','B','C','D','E'};
        char[] chars2={'F','G','J','I','K'};
        char[] chars3=ArraysUtility.mergeArrays(chars1,chars2);
        System.out.println(Arrays.toString(chars3));
    }

   //removes the element at given index of the array
   //{1,2,3,4,5}       new object{1,2,4,5}
    public static int[] removeElement(int[] array, int index){

        if(index<=0 || index>= array.length-1){
            //if the given index number is INVALID
            System.err.println("Invalid Index");
            //return array;
            System.exit(0);//TERMINATES entire system
            //next code fragments will not be executed
        }
      int[] arr1=new int[array.length-1];
        for (int i = 0, j=0; i < array.length ; i++) {
            //j is representing index number of second new array here ==>arr1
            if(i==index){//moves all elements of array except the element at given index
                continue;
            }else {
               arr1[j++] =array[i];
            }
        }

        return arr1;
    }

    //removes the element at given index of the array
    public static double[] removeElement(double[] array, int index){

        if(index<=0 || index>= array.length-1){
            //if the given index number is INVALID
            System.err.println("Invalid Index");
            //return array;
            System.exit(0);//TERMINATES entire system
            //next code fragments will not be executed
        }
        double[] arr1=new double[array.length-1];
        for (int i = 0, j=0; i < array.length ; i++) {
            //j is representing index number of second new array here ==>arr1
            if(i==index){//moves all elements of array except the element at given index
                continue;
            }else {
                arr1[j++] =array[i];
            }
        }

        return arr1;
    }

    //removes the element at given index of the array
    public static String[] removeElement(String[] array, int index){

        if(index<0 || index> array.length-1){
            //if the given index number is INVALID
            System.err.println("Invalid Index");
            //return array;
            System.exit(0);//TERMINATES entire system
            //next code fragments will not be executed
        }
        String[] arr1=new String[array.length-1];
        for (int i = 0, j=0; i < array.length ; i++) {
            //j is representing index number of second new array here ==>arr1
            if(i==index){//moves all elements of array except the element at given index
                continue;
            }else {
                arr1[j++] =array[i];
            }
        }

        return arr1;
    }

    //removes the element at given index of the array
    public static char[] removeElement(char[] array, int index){

        if(index<0 || index> array.length-1){
            //if the given index number is INVALID
            System.err.println("Invalid Index");
            //return array;
            System.exit(0);//TERMINATES entire system
            //next code fragments will not be executed
        }
        char[] arr1=new char[array.length-1];
        for (int i = 0, j=0; i < array.length ; i++) {
            //j is representing index number of second new array here ==>arr1
            if(i==index){//moves all elements of array except the element at given index
                continue;
            }else {
                arr1[j++] =array[i];
            }
        }

        return arr1;
    }
}
