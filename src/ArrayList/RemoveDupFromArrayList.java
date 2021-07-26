package ArrayList;

import java.util.ArrayList;

public class RemoveDupFromArrayList {
    public static void main(String[] args) {
        ArrayList<Character> characters =new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);
        ArrayList<Character> removedDup=new ArrayList<>(); //[A,B,C]

        for(Character each: characters){
            if( !removedDup.contains(each) ){
                removedDup.add(each);
            }
        }
        System.out.println(removedDup);

        System.out.println("----------------------------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> reversedNums= new ArrayList<>();

        for (int i = nums.size()-1; i>=0 ; i--) {
            reversedNums.add( nums.get(i) ); //400,300,200,100
        }

        System.out.println(reversedNums);

        System.out.println("--------------------------------------------------");
        ArrayList<Integer> n1 =new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(10);
        n2.add(20);

        //System.out.println(n1==n2);//ALWAYS FALSE!!!!

        System.out.println(n1.equals(n2));
    }
}
