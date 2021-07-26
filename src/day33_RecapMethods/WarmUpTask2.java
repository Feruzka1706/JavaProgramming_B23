package day33_RecapMethods;

import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
         boolean result=contains(array,5);
        System.out.println(result);
    }


    public static boolean contains(int[] arr, int element){


        for(int each:arr){
            if(each==element){
                return true;
            }
        }

        return false;
    }


    public static boolean contains(double[] arr, double element){


        for(double each:arr){
            if(each==element){
                return true;
            }
        }

        return false;
    }


    public static boolean contains(String[] arr, double element){


        for(String each:arr){
            if(each.equals(element)){
                return true;
            }
        }

        return false;
    }


    public static boolean contains(char[] arr, char element){


        for(char each:arr){
            if(each==element){
                return true;
            }
        }

        return false;
    }
}
