package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9));



        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,2,3,4,5,6,7,8,9);
        list.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9) );
        //We MUST provide collection type

        list.addAll( nums);
        //we are adding one collection type to another collection type
        list.addAll( Arrays.asList(10,11,12,13,14,15) );

        System.out.println(list);
        System.out.println("-------------------------------------------------------");
        ArrayList<String> students =new ArrayList<>();
        students.addAll( Arrays.asList("Feruza","Feruza", "Maftuna","Maftuna", "Zulkhumor","Zulkhumor", "Nazli","Gulistan") );
        //it will add

        System.out.println(students);
        students.removeAll( Arrays.asList("Feruza","Maftuna", "Zulkhumor") );
        //it will remove all matching elements which are given inside removeAll(....)
        System.out.println(students);

        System.out.println("------------------------------------------------------");
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll( Arrays.asList( 1,1,1,1,2,2,2,2,3,3,3,3,4,4,5,6,7,8,9,1,1,1,1,1,1,1,1,1,1,1) );

        //numbers.removeAll( Arrays.asList(1) );
        numbers.retainAll( Arrays.asList(1,2) );
        //removes all the elements that are not matching with 1

        System.out.println(numbers);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<String> employees= new ArrayList<>();

        employees.addAll( Arrays.asList("Dilem","Fhillip","Abbos","Ahmet","Andrei","Gabil","Aliya","Atila"));
        employees.removeAll( Arrays.asList("Ahmet", "Andrei"));
        //removes all the elements that are matching given elements inside removeAll(....)
        //employees.retainAll( Arrays.asList("Ahmet","Andrei"));
        //it will keep elements only with matching with given elements inside retainAll(....) method
        System.out.println(employees);

        System.out.println("------------------------------------------------------------");
        ArrayList<String> groceryList =new ArrayList<>();
        groceryList.addAll( Arrays.asList("Soda", "Milk","Wine","Beer","Eggs","Bread","Water","Apple","Cherry") );
        //Soda,Wine,Beer ==check those items are contained inside groceryList or not

        boolean hasItems =groceryList.containsAll( Arrays.asList("Soda","Wine","Beer","Coffee") );
        System.out.println(hasItems);

    }
}
