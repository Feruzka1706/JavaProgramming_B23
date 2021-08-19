package Practice_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<String> cities =new ArrayList<>();
        // add(Object):  adds the elements to the indexes of the arraylist
        cities.add("London");
        cities.add("Istanbul");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("California");
        cities.add("New York");

        // add(index, Object): adds the element to the given index (index must be exist)
        cities.add(0,"Vienna");
        // get(index): returns the element at given index
        cities.get(0);

        // set(index, Object): replaces the old element at given index with new element
        cities.set(0,"Miami");
        // indexOf(Object): returns the first matching object' index number
        cities.indexOf("Miami");
        // size(): returns the total number of elements
        cities.size();
        // remove(index): removes the object at the given index
        cities.remove(0);
        // remove(object): removes the first matching object
        cities.remove("London");


        //  Bulk Operations.
        // removeAll() : to remove multiple elements
        cities.removeAll(Arrays.asList("Paris","Istanbul"));

        // retainAll() : to retain multiple elements
        cities.add("Paris");
        cities.add("Istanbul");
        cities.retainAll(Arrays.asList("Paris","Istanbul"));

        // removeIf()  : removes element according to condition
        cities.removeIf(each-> each.length()>6);
       // System.out.println(cities);
        cities.removeIf(each-> each.contains("New York"));

        // clear(): removes all the objects from the List
        cities.clear();

        // isEmpty(): returns true if the list contains no element
        System.out.println(cities.isEmpty() ? "list is empty": cities);
        System.out.println(cities.size()==0 ? "list is empty": cities);

    }
}
