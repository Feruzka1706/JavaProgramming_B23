package Day11_SwitchStatement;

public class CalculatingWithSwitch {
    public static void main(String[] args) {
 /*
 Given two double variables n1, n2 and a char variable named operator.
  use switch statement to calculate the result of n1 & n2 based on the given operator
        Valid operators are: -, +, *, /
  */

       double n1 =100;
       double n2 =2.5;
       double result=0;

       char mathOperator= '%';//+, -, *, /

       switch(mathOperator){

           case '-':
               result=n1-n2;
               break;

           case '+':
               result=n1+n2;
               break;

           case '*':
               result=n1*n2;
               break;

           case '/':
               result=n1/n2;
               break;

           default:
               System.err.println("Invalid operator");

       }

        System.out.println(result);
    }
}
