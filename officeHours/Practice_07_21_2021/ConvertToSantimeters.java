package Practice_07_21_2021;

import com.sun.org.apache.regexp.internal.RE;

public class ConvertToSantimeters {
    public static void main(String[] args) {
        
        double feet=5;
        double inches=12;
        
        double result=calcFeetAndInchesToCentimeters(5,12);
        System.out.println(result);

        double resul2=calcFeetAndInchesToCentimeters(72);
        System.out.println("resul2 = " + resul2);

    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){

        if(feet<0 || inches<0 || inches>12) {
            return -1;
        }
        double cantimeters=( (feet*12) +inches)*2.54;
        
        return cantimeters;


    }
    
    public static double calcFeetAndInchesToCentimeters (double inches){
        if(inches<0){
            return -1;
        }
        
        //62   1 feet==12 inches
        double remainingInches=inches%12; // answer 2
        double feet=inches/12;     // answer 5
        
        
        double cantimeters=( (feet*12) +remainingInches)*2.54;
        return cantimeters;
    }
}
/*
Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
			   Feet is the first parameter, inches is the second parameter.
				- You should validate that the first parameter feet is >=0, and second parameter inches is >=0 and <=12.
					 Return -1 from the method if either of the above is not true.
				- If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this
				 		  method and return that value.
				- Create a second method of the same name but with only one parameter inches is the parameter and validate it
						  >=0, return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.
				- Call the other overloaded method passing the correct feet and inches calculated so that it can calculate
								correctly.
				- Hints : Use double for your number data types 1 inch = 2.54cm and 1 ft =12 inches
     */
