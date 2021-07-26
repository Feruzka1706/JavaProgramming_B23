package utilities;

import day33_RecapMethods.WarmUpTask3;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        int[] arr={10,20,100,-300,400,50};
        int result=maxNumber(arr);
        System.out.println(result);
    }

    //1.create a function that can return the maximum number from an array of integer
    // max(new int[] {10,20,30} )==>30

    // returns the maximum number from an array of int
    public static int maxNumber(int[] arr){
      int max=arr[0];

      for(int eachElement:arr){

          if(eachElement>max){
              max=eachElement;
          }
      }
       return max;
    }

    // returns the maximum number from an array of double
    public static double maxNumber(double[] arr){
        double max=arr[0];

        for(double eachElement:arr){

            max=Math.max(eachElement,max);
            //if(eachElement>max){
              //  max=eachElement;
            //}
        }
        return max;
    }



    //2.create a function that can return the minimum number from an array of integer
    //min(new int[] {10,20,30} )==>10

    // returns the minimum number from an array of int
    public static int min(int[] array){
        int minNumber=array[0];

        for(int each:array){
            if(each<minNumber){
                minNumber=each;
            }
        }
        return minNumber;
    }

    // returns the minimum number from an array of double
    public static double min(double[] array){
        double minNumber=array[0];

        for(double each:array){
            if(each<minNumber){
                minNumber=each;
            }
        }
        return minNumber;
    }



    //adds integer element to an int array
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


    //adds double element to a double array
    public static double[] addElement(double[] array, double number){
        double[] result=Arrays.copyOf(array, array.length+1);//{1.5,2.5,3.5,0.0};
        result[result.length-1]=number;//{1.5,2.5,3.5,0.0};

        return result;
    }


    //adds String element to a String array
    public static String[] addElement(String[] array, String str){
        String[] array2=Arrays.copyOf(array,array.length+1);//{A,B,null}
        array2[array2.length-1]=str; //{A,B,C}


        return array2;

    }


   //adds char element to a char array
    public static char[] addElement(char[] array, char ch){
        char[] result=Arrays.copyOf(array, array.length+1);
        result[result.length-1]=ch;

        return result;
    }


   //merge two arrays of integer
    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int[] arr3=new int[arr1.length+ arr2.length];
        
        int j=0;
        for (int each :arr1){//each element in arr1
            arr3[j++]=each;
        }

        for (int each:arr2) {
            arr3[j++]=each;
        }

        return arr3;

    }

    //merge two arrays of double
    public static double[] mergeArrays(double[] arr1, double[] arr2){

        double[] arr3=new double[arr1.length+ arr2.length];

        int j=0;
        for (double each :arr1){//each element in arr1
            arr3[j++]=each;
        }

        for (double each:arr2) {
            arr3[j++]=each;
        }

        return arr3;

    }

   //merge two arrays of String
    public static String[] mergeArrays(String[] arr1, String[] arr2){

        String[] arr3=new String[arr1.length+ arr2.length];

        int j=0;
        for (String each :arr1){//each element in arr1
            arr3[j++]=each;
        }

        for (String each:arr2) {
            arr3[j++]=each;
        }

        return arr3;

    }

   //merge two arrays of char
    public static char[] mergeArrays(char[] arr1, char[] arr2){

        char[] arr3=new char[arr1.length+ arr2.length];

        int j=0;
        for (char each :arr1){//each element in arr1
            arr3[j++]=each;
        }

        for (char each:arr2) {
            arr3[j++]=each;
        }

        return arr3;

    }



    //removes the int element at given index of the array
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

    //removes the double element at given index of double array
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


    //removes the string element at given index of String array
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

    //removes the char element at given index of char array
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



    //returns frequency of the  int element of integer array
    public static int frequency(int[] array, double number){
        int frequencyOfElement=0;

        for(int each: array){
            if(each==number){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }

    //returns frequency of the char element of char array
    public static int frequency(char[] array, char ch){
        int frequencyOfElement=0;

        for(char each: array){
            if(each==ch){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }

    //returns frequency of the double element of double array
    public static int frequency(double[] array, double number){
        int frequencyOfElement=0;

        for(double each: array){
            if(each==number){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }

    //returns frequency of the String  element of String array
    public static int frequency(String[] array, String element){
        int frequencyOfElement=0;

        for(String each: array){
            if(each.equals(element)){
                frequencyOfElement++;
            }
        }
        return frequencyOfElement;
    }



    //returns unique element of integer array
    public static int[] unique(int[] array){
        int[] result={};

        for(int each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    //returns unique element of double  array
    public static double[] unique(double[] array){
        double[] result={};

        for(double each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    //returns unique element of String array
    public static String[] unique(String[] array){
        String[] result={};

        for(String each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    //returns unique element char array
    public static char[] unique(char[] array){
        char[] result={};

        for(char each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }



    //checks if the given element is contained in the given array, returns boolean
    public static boolean contains(int[] arr, int element){


        for(int each:arr){
            if(each==element){
                return true;
            }
        }

        return false;
    }

    //checks if the given element is contained in the given array, returns boolean
    public static boolean contains(double[] arr, double element){


        for(double each:arr){
            if(each==element){
                return true;
            }
        }

        return false;
    }

    //checks if the given element is contained in the given array, returns boolean
    public static boolean contains(String[] arr, String element){


        for(String each:arr){
            if(each.equals(element)){
                return true;
            }
        }

        return false;
    }

    //checks if the given element is contained in the given array, returns boolean
    public static boolean contains(char[] arr, char element){


        for(char each:arr){
            if(each==element){
                return true;
            }
        }

        return false;
    }



   //removes the duplicate elements from given integer array
    public static int[] removeDup(int[] array){
        int[] newArr= {};//1,2,3,4,5

        for(int each:array){
            if( !ArraysUtility.contains(newArr,each)){
                //if the element is not contained in newArray
                newArr=ArraysUtility.addElement(newArr,each);//then add the element to the array
            }
        }
        return newArr;
    }

    //removes the duplicate elements from given double array
    public static double[] removeDup(double[] array){
        double[] newArr= {};//1,2,3,4,5

        for(double each:array){
            if( !ArraysUtility.contains(newArr,each)){
                //if the element is not contained in newArray
                newArr=ArraysUtility.addElement(newArr,each);//then add the element to the array
            }
        }
        return newArr;
    }

    //removes the duplicate elements from given String array
    public static String[] removeDup(String[] array){
        String[] newArr= {};//1,2,3,4,5

        for(String each:array){
            if( !ArraysUtility.contains(newArr,each)){
                //if the element is not contained in newArray
                newArr=ArraysUtility.addElement(newArr,each);//then add the element to the array
            }
        }
        return newArr;
    }

    //removes the duplicate elements from given char array
    public static char[] removeDup(char[] array){
        char[] newArr= {};//1,2,3,4,5

        for(char each:array){
            if( !ArraysUtility.contains(newArr,each)){
                //if the element is not contained in newArray
                newArr=ArraysUtility.addElement(newArr,each);//then add the element to the array
            }
        }
        return newArr;
    }



    //reverses the given integer array
    public static int[] reverse (int[] array){
        int[] result = new int[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }


    //reverses the given double array
    public static double[] reverse (double[] array){
        double[] result = new double[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }


    //reverses the given String array
    public static String[] reverse (String[] array){
        String[] result = new String[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }


    //reverses the given char array
    public static char[] reverse (char[] array){
        char[] result = new char[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }



}
