package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        byte hourlyRate = 60;
        byte weeklyHours = 50;
        byte numberOfWeeksInAYear = 48;

        int salary = hourlyRate * weeklyHours * numberOfWeeksInAYear ;

        System.out.println(salary);

        double taxRate = 0.24;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);

    }

}
/* Salary calculator
  hourly rate
  weekly hours
  datatype(int) variable name(salary) = hourly rate * weekly hours * 52(total weeks in a year)
  system.out.println(salary);
 */
