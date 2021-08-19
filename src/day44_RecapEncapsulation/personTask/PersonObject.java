package day44_RecapEncapsulation.personTask;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {

        PersonTask person1=new PersonTask("John",'M', LocalDate.of(1998,10,8),"USA","English");
        System.out.println(person1);

    }
}
