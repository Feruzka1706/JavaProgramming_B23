package ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> groceryList =new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Vinegar");
        groceryList.add("Bread");

        System.out.println(groceryList);

        groceryList.set(0,"Toilet paper");
        groceryList.set(3,"Soda");
        System.out.println(groceryList);
        
        boolean hasToiletPaper=groceryList.contains("Toilet paper");
        boolean hasToiletPaper2=groceryList.indexOf("Toilet paper")>=0;

        System.out.println("hasToiletPaper = " + hasToiletPaper);
        System.out.println("hasToiletPaper2 = " + hasToiletPaper2);

        System.out.println("---------------------------------------------------------");
        //remove(index)
        groceryList.remove(1);

        //remove(Object)
        groceryList.remove("Toilet paper");
        //boolean r1=groceryList.remove("Toilet paper");
        System.out.println(groceryList);
        //System.out.println(r1);


        boolean r2=groceryList.remove("Face Masks");
        System.out.println(groceryList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        //list1.remove( Integer.valueOf(30) );
        list1.remove( (Integer) 30);

        System.out.println(list1);

        groceryList.clear();
        System.out.println(groceryList);

        list1.clear();
        System.out.println(list1);

        System.out.println("-------------------------------------------------------");

        ArrayList<Character> list =new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('A');
        list.add('D');
        list.add('A');
        list.add('F');
        System.out.println(list);

        //list.indexOf('B'); //3
        //list.lastIndexOf('B');//3

        ArrayList<Character> unqiueChars=new ArrayList<>();

        for(Character each: list){
            if(list.indexOf(each)==list.lastIndexOf(each)){
                unqiueChars.add(each);
            }
        }
        System.out.println(unqiueChars);
    }
}
