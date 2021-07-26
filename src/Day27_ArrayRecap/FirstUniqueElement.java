package Day27_ArrayRecap;

public class FirstUniqueElement {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4}; //2
        int firstUniqueElement=0;

        /*

        for (int j = 0; j < nums.length ; j++) {
            //this outer loop responsible for repeating the inner loop, to find frequency of every single element

         */

          /*
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[j]) {
                    //we use J from outer loop for to find every element from the array
                    frequency++;
                }
            }//this loop help to find the frequency of the ONE element from the array

            if (frequency == 1) {//it means the element is unique
                firstUniqueElement = nums[j];
                break;
                //to stop the loop, and the memory will memorize only FIRST UNIQUE element
                //only the first unique element will return
            }

           */


        for(int each:nums){

            int frequency=0;//to store frequency of each element
            for(int element:nums){
                if(element==each){
                    frequency++;
                }
            }

            if(frequency==1){
                firstUniqueElement=each;
                break;
            }
        }
        System.out.println(firstUniqueElement);


    }
}
/*
 write a program that can return first unique element from the array
array:[1,2,1,3,3,4,5,5]==> 2
 */