package day45_OOP_InheritanceIntro.EmployeeTask;

public class AmazonInc {//Amazon has Tester
    public static void main(String[] args) {

        Tester tester1=new Tester("Robinson",28,'M',1234,"SDET",125000);
        tester1.eat("steak");
        tester1.sleep();
        tester1.testing();

        Developer developer1=new Developer("Selda",30,'F',278,"Java Developer",150000);
        developer1.eat("sushi");
        developer1.sleep();
        developer1.coding();
        developer1.fixBugs();

        Driver driver1=new Driver("John",35,'M',1235,"Driver",50000);
        driver1.eat("lobster");
        driver1.sleep();
        driver1.drive();



    }
}
