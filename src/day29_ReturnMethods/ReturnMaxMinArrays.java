package day29_ReturnMethods;

public class ReturnMaxMinArrays {
    public static void main(String[] args) {
        int[] arr={100,300,400,-100,500,5,0,30};
        int maxNumber =maxElement(arr);
        System.out.println(maxNumber);

        int minNumber=minElement(arr);
        System.out.println(minNumber);
    }

    public static int maxElement(int[] arr){
        int maxArr=arr[0];


        for (int i = 0; i <arr.length ; i++) {
            int element1=arr[i];
            if(element1>maxArr){
                maxArr=element1;
            }
        }
        return maxArr;
    }

    public static int minElement(int[] arr){
        int minArr=arr[0];
        for (int i = 0; i <arr.length ; i++) {
          int minElement=arr[i];
          if(minElement<minArr){
              minArr=minElement;
          }
        }
        return minArr;
    }
}
