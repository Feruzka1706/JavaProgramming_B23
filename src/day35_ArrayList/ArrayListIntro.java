package day35_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int[] nums =new int[10];//size is 10 fixed
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);

        ArrayList<Integer> numbers=new ArrayList<>();//size is empty now
        numbers.add(10); //autoboxing
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(0,15);
        numbers.add(20);
        //{15, 10, 20, 30, 40, 20}
        System.out.println(numbers);
        System.out.println(numbers.get(2));

        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("--------------------------------------------------------");
        //to use for each Loop we have to have data structure
        //and Array list part of Collection which is one of Data structure
        for( Integer each: numbers){
            System.out.println(each);
        }
    }
}
