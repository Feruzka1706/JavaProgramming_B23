package day10_NestedIfStatements;

public class DaysInWeek {
    public static void main(String[] args) {

        int number =10; //1-7
        String name="";
      if(number>=1 && number<=7) {

          if (number == 1) {
              name = "Monday";
          } else if (number == 2) {
              name = "Tuesday";
          } else if (number == 3) {
              name = "Wednesday";
          } else if (number == 4) {
              name = "Thursday";
          } else if (number == 5) {
              name = "Friday";
          } else if (number == 6) {
              name = "Sturday";
          } else {
              name = "Sunday";
          }
          System.out.println("name = " + name);

          
      }else{
          name= " Don't be fool, come on! Week is only 7 days:))";

          System.out.println(name);
          int number2=25;
      }

    }
}
/*
name=(number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday"
     :(number==4)? "Thursday" :(number==5)? "Friday" :(number==6)? "Saturday" : "Sunday";

     This is how to use Ternary


     System.out.println("name = " +name);
 */