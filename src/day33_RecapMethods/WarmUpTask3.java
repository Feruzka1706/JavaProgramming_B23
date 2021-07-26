package day33_RecapMethods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {
    public static void main(String[] args) {
      int[] array={1,1,1,2,3,3,4,5,5,6};
      int[] result1={};

      for(int each:array){
          if( frequency(array,each) == 1 ){
              result1= ArraysUtility.addElement(result1,each);
          }
      }
        System.out.println(Arrays.toString(result1));

        System.out.println("-------------------------------------------------------------");

        double[] array1={10.4,10.4,3.5,6.7};
        int result=frequency(array1,10.4);
        System.out.println(result);

        System.out.println("---------------------------------------------");

        String[] array2={"Apple", "Apple", "Apple", "Orange"};
        int result2=frequency(array2,"Orange");
        System.out.println(result2);

        System.out.println("---------------------------------------------------------------");

        char[] array3={'A','A','B','C','D'};
        int result3=frequency(array3,'A');
        System.out.println(result3);
    }

    public static int frequency(int[] array, int number){
        int frequencyOfElement=0;

        for(int each: array){
            if(each==number){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }

    public static int frequency(char[] array, char ch){
        int frequencyOfElement=0;

        for(char each: array){
            if(each==ch){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }


    public static int frequency(double[] array, double number){
        int frequencyOfElement=0;

        for(double each: array){
            if(each==number){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }


    public static int frequency(String[] array, String element){
        int frequencyOfElement=0;

        for(String each: array){
            if(each.equals(element)){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }




}
/*
1. create method that accepts one integer array and one integer number and returns the frequency of the number
                Ex:
                    int[] array ={1,1,1,1,1,2,2};

                    frequency(array, 1) ==> 5

 */