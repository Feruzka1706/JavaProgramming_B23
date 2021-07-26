package Day11_SwitchStatement;

public class NameOfMonthSwitchStatement {
    public static void main(String[] args) {
         int number = 13;
         String nameOfMonths ="";

         switch (number){
             case 1:
                 nameOfMonths="January";
                 break;
             case 2:
                 nameOfMonths="February";
                 break;
             case 3:
                 nameOfMonths="March";
                 break;
             case 4:
                 nameOfMonths="April";
                 break;
             case 5:
                 nameOfMonths="May";
                 break;
             case 6:
                 nameOfMonths="June";
                 break;
             case 7:
                 nameOfMonths="July";
                 break;
             case 8:
                 nameOfMonths="August";
                 break;
             case 9:
                 nameOfMonths="September";
                 break;
             case 10:
                 nameOfMonths="October";
                 break;
             case 11:
                 nameOfMonths="November";
                 break;
             case 12:
                 nameOfMonths="December";
                 break;

             default:
                 nameOfMonths="Invalid";
         }

        System.out.println("You entered month is "+nameOfMonths);
    }
}
