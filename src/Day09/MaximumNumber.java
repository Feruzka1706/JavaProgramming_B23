package Day09;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1=20,
                num2=30;
        if(num1>num2){
            System.out.println(num1+ " is maximum number");
        }
        if(num2>num1){
            System.out.println(num2+ " is maximum number");
        }

        System.out.println("--------------------------------");

        if(num2>num1){
            System.out.println(num2+ " is maximum number");
        }else{
            System.out.println(num2+ " is not maximum number");
        }

    }
}
/*
write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number

 */