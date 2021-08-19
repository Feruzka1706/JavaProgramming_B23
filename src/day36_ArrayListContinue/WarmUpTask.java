package day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5) );
        numbers.set(numbers.size()-1, 0);

        System.out.println(numbers);

        System.out.println("-------------------------------------------------------------------------------");


        ArrayList<Integer> numbers2=new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0; i< numbers2.size();i++){
            int each= numbers2.get(i);
            if(each%2!=0){
                result.addAll(Arrays.asList(each*2));
            }else {
                result.addAll(Arrays.asList(each));
            }
        }
        System.out.println(result);

        System.out.println("----------------------------------------------------");

        String[] arr1={"A","B","C"},
                arr2={"D","E","F","G"};

        ArrayList<String> result3 =new ArrayList<>(Arrays.asList(arr1));
        //will adding all elements from arr1 to result ArrayList

        result3.addAll(Arrays.asList(arr2));

        /*
        for(String each:arr1){
            result3.add(each);
        }

        for(String each: arr2){
            result3.add(each);
        }

         */

        System.out.println(result3);

        System.out.println("------------------------------------------------------------");

        int[] nums={1,2,3,4,5,6,7};
        ArrayList<Integer> list=new ArrayList<>();

        //list.addAll( Arrays.asList(nums) );
        //it will not accept primitive to collection!!!!

        for(int each: nums){
           list.add(each);
        }
        System.out.println(list);


    }
}
/*
 write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];

    2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

    3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */