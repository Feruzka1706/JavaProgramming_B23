package utilities;

public class NumbersUtility {
    public static void main(String[] args) {

       String result1= isOdd(1,100);//user should provide two numbers and it will print
        //all ODD NUMBERS between those two numbers , including these two numbers also
        System.out.println(result1);//odd numbers

        String result2=isEven(20,100);
        //user should provide two numbers and it will print all EVEN numbers between those two numbers
        //including these two numbers also
        System.out.println(result2);//even numbers

        String calculationResult=calculation(10,29,'*');
        System.out.println(calculationResult);


        int[] numbers={100,200,400,700,-1,-50,20};
        int maxNum=max(numbers);
        System.out.println(maxNum);


        int minNum= min(numbers);
        System.out.println(minNum);


    }

    //method that can print ODD numbers between two numbers
    public static String isOdd(int num1, int num2){
        String  result="";
        for (int i = num1; i <=num2 ; i++) {
            if(i%2!=0){
                result+=i+" ";
            }
        }
        return result;
    }


    //method that can print all EVEN numbers between two numbers
    public static String isEven(int num1, int num2){
        String result="";
        for (int i = num1; i <num2; i++) {
            if(i%2==0){
                result+=i+" ";
            }
        }

        return result;
    }


    public static String calculation (int num1, int num2, char operator){
        String result="";
        /*
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first number:");
         num1= scan.nextInt();
        System.out.println("Enter second number:");
        num2= scan.nextInt();
        System.out.println("Enter math operator:");
        operator=scan.next().charAt(0);
         */

        if(operator=='+'){
            result="Addition: "+(num1+num2);
        }else if(operator=='-'){
            result="Subtraction: "+(num1-num2);
        }else if(operator=='*'){
            result="Multiplication: "+(num1*num2);
        }else if(operator=='/'){
            result="Division: "+(num1/num2);
        }else if(operator=='%'){
            result="Remainder: "+(num1%num2);
        }else{
            result="Invalid math operator! Please enter * or + or - or / or %";
        }

        return result;
    }


    public static int max (int[] numbers){

        int maxNum=numbers[0];

        for (int eachNum : numbers) {
            if(eachNum>maxNum){
                maxNum=eachNum;
            }
        }
        return maxNum;
    }

    public static int min (int[] numbers){
        int minNum=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            int eachElement=numbers[i];

            if(eachElement<minNum){
                minNum=eachElement;
            }
        }

        return minNum;
    }


}
