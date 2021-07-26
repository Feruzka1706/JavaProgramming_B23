package day32_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
     int[] array={1,2,3,4,5,6,7,8,9};
     int element =10;
        System.out.println(Arrays.toString(array));

     array=addInteger(array,element);// {1,2,3,4,5,6,7,8,9,10}

        System.out.println(Arrays.toString(array));

        //array=addInteger(array,11);
        //System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(addInteger(array,11)));

        System.out.println("-------------------------------------------------------------");
        double[] array2={2.5, 3.5};
        System.out.println(Arrays.toString(array2));

        array2=addDouble(array2,4.5);//{2.5, 3.5, 4.5}
        System.out.println(Arrays.toString(array2));

        array2=addDouble(array2,5.5);//{2.5, 3.5, 4.5, 5.5}
        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------------------------------");
        String[] group1={"Sabir","Gabil","Dilem"};
        String student="Christian";

        group1=addString(group1,student);
        System.out.println(Arrays.toString(group1));

        System.out.println("---------------------------------------------------------------------");
        char[] array3={'A','B'};
        array3=addChar(array3,'C');
        System.out.println(Arrays.toString(array3));

        System.out.println("---------------------Method Overloading-----------------------------------");

        int[] arr1={1,2,3,4,5,6,7};
        arr1=addElement(arr1,8);
        System.out.println(Arrays.toString(arr1));

        double[] arr2={10.5,3.5,4.5};
        arr2=addElement(arr2,5.6);
        System.out.println(Arrays.toString(arr2));

        String[] arr3={"Java", "and", "Python", "are","most","programming"};
        arr3=addElement(arr3,"language");
        System.out.println(Arrays.toString(arr3));

        char[] arr4={'F','E','R','U','Z'};
        arr4=addElement(arr4,'A');
        System.out.println(Arrays.toString(arr4));

    }

    public static int[] addInteger(int[] array, int number){
       /*
        int[] result=new int[array.length+1];
        int i=0;
        for(int each: array){
            result[i++]=each;
        }
          result[i]=number;
        */

        int[] result=Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;

        return result;
    }

    public static double[] addDouble(double[] array, double number){
         double[] result=Arrays.copyOf(array, array.length+1);//{1.5,2.5,3.5,0.0};
         result[result.length-1]=number;//{1.5,2.5,3.5,0.0};

        return result;
    }

    public static String[] addString(String[] array, String str){
        String[] array2=Arrays.copyOf(array,array.length+1);//{A,B,null}
        array2[array2.length-1]=str; //{A,B,C}


        return array2;

    }

    public static char[] addChar(char[] array, char ch){
        char[] result=Arrays.copyOf(array, array.length+1);
        result[result.length-1]=ch;

        return result;
    }

    //------------------------------method overloading-------------------------------------------

    public static int[] addElement(int[] array, int number){
       /*
        int[] result=new int[array.length+1];
        int i=0;
        for(int each: array){
            result[i++]=each;
        }
          result[i]=number;
        */

        int[] result=Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;

        return result;
    }

    public static double[] addElement(double[] array, double number){
        double[] result=Arrays.copyOf(array, array.length+1);//{1.5,2.5,3.5,0.0};
        result[result.length-1]=number;//{1.5,2.5,3.5,0.0};

        return result;
    }

    public static String[] addElement(String[] array, String str){
        String[] array2=Arrays.copyOf(array,array.length+1);//{A,B,null}
        array2[array2.length-1]=str; //{A,B,C}


        return array2;

    }

    public static char[] addElement(char[] array, char ch){
        char[] result=Arrays.copyOf(array, array.length+1);
        result[result.length-1]=ch;

        return result;
    }

}
/*
Task2:
    1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array

 */