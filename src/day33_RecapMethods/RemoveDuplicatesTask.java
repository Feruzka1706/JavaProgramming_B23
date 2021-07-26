package day33_RecapMethods;
import utilities.ArraysUtility;
import java.util.Arrays;

public class RemoveDuplicatesTask {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5};

        int[] result={};

        for(int each:array){
           if( WarmUpTask3.frequency(array,each)==1){
               result=ArraysUtility.addElement(result,each);
           }
        }
        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------------------------------------------");

        int[] array2={100,200,100,200,300,400,500,600,600};
        int[] newArray=unique(array2);

        System.out.println(Arrays.toString(newArray));

        System.out.println("---------------------------------------------------");
        double[] arr={10.4,5.6,10.4,4.5,7.9,8.4};
        arr=unique(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("--------------------------------------------------------");
        String[] str={"Ahmad","Gulistan","Nazli","Feruza","Feruza","Nazli"};
        String[] group2=unique(str);
        System.out.println(Arrays.toString(group2));


        System.out.println("------------------------------------------------------------");
        char[] charArray={'A','A','B','C','C','F'};
        char[] newArray2=unique(charArray);
        System.out.println(Arrays.toString(newArray2));
    }



    public static int[] unique(int[] array){
        int[] result={};

        for(int each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }


    public static double[] unique(double[] array){
        double[] result={};

        for(double each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }


    public static String[] unique(String[] array){
        String[] result={};

        for(String each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }


    public static char[] unique(char[] array){
        char[] result={};

        for(char each:array){
            if( WarmUpTask3.frequency(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }





}
