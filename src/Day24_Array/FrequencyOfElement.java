package Day24_Array;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4};

        for (int j = 0; j < arr.length ; j++) {

            int element = arr[j];//1
            int frequency = 0;//to store the frequency of element

            for (int i = 0; i < arr.length; i++) {
                //used finding the frequency of one element

                if (arr[i] == element) {//if the element is occured in the array
                    frequency++;
                }
            }

        if (frequency == 1) {//to check if the element is unique
                System.out.print(element+" ");
            }

        }


    }
}
/*
 write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */