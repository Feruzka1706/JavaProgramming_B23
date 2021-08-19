package day43_OOP_Encaplsulation;

public class Task {

    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicVariable );
        //public access modifier is reachable within the same package
        System.out.println( AccessModifiers.defaultVariable );
        //default access modifier is reachable within the same package

        //System.out.println(AccessModifiers.privateVariable);
        //private access modifier is  NOT reachable within the same package

        System.out.println("=======================================================================");

        EncapsulationIntro obj1=new EncapsulationIntro();

      /*
        System.out.println(obj1.username);
        System.out.println(obj1.password);
        obj1.username="H";
        obj1.password="123";
        System.out.println(obj1.username);
        System.out.println(obj1.password);

         */

        System.out.println(obj1.getUsername() );
        System.out.println(obj1.getPassword());


        obj1.setUsername("H");
        obj1.setPassword("123");

        System.out.println(obj1.getUsername() );
        System.out.println(obj1.getPassword() );








    }
}
