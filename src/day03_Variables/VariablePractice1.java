package day03_Variables;

public class VariablePractice1 {
    public static void main(String[] args) {

        double num1 = 0.5;
        float num2 = 0.5f;
        System.out.println("----------------------");
        byte byteNumber = 100;
        short shortNumber = byteNumber;
        //byte byteNumber2 = shortNumber; larger type cannot be assigned to smaller one;

        int intNumber = 100;
        long longNumber = intNumber; // smaller primitive type can be assigned to larger one;
        // intNumber2 = longNumber; larger type cannot be assigned to smaller one;
    }

}
// larger primitive can't be assigned into smaller one
//double vs float (difference between them)
// to make a variable of float data type after number add lower case or upper case F(f)
/* double is the largest decimal number
 long is the the largest primitive number (int can be assigned to float or double but float or double can't be assigned into int)
 */
// we use mostly int and double;
/* int: for all whole numbers;
double: for all decimal numbers;
 */