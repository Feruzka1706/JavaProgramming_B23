package day42_CustomClass_ConstructorContinue;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ahmad");
        Employee employee2=new Employee("Zulkhumor", "SDET");
        Employee employee3=new Employee("Maftuna","QA",1234);
        Employee employee4=new Employee("Nazli","SDET",2457,120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
