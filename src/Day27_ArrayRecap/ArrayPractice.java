package Day27_ArrayRecap;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {

        int[] array=new int[2];//initializing SIZE the array
        array[0]=10;
        array[1]=20;

       // array[2]=30; //the size of array is now only 2
        //array[3]=40;//it cannot to be added after fixing the array of size

        array=new int[4];//we reinitialized the size of the array
        array[2]=30;
        array[3]=40;


        System.out.println(Arrays.toString(array));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers.length);
        // -length is method in ARRAY not string method!!!
        System.out.println(numbers[0]);//first index of the array
        System.out.println(numbers[numbers.length-1]);//last index of the array

        for (int i = 0; i <=numbers.length-1 ; i++) {
                          //i<numbers.length;
            System.out.print(numbers[i]+" ");

        }
    }
}
