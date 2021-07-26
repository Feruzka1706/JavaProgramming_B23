package day29_ReturnMethods;

public class ReturnMethodsTask {
    public static void main(String[] args) {
        //find max number between 10 & 20 , then multiply it by 2
        int max=maxNumber(10,20)*2;
        System.out.println(max);
       int minNumber =minNum(10,20);
        System.out.println(minNumber);

    }

    public static int maxNumber (int a, int b){
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }

    public static int minNum(int a, int b){
        return (a<b)?a:b;
    }
}
