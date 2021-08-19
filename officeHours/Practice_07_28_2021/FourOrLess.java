package Practice_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>(Arrays.asList("apples","tree", "loop", "cat", "animal", "shortcut" ) );

        ArrayList<String> result =new ArrayList<>();

     /*
        for (int i = 0; i < list.size(); i++) {
            String each=list.get(i);
            if(each.length()<=4){
                result.add(each);
            }
        }
        System.out.println(result);

      */
        // Option 2
        list.removeIf(each-> each.length()>4);
        System.out.println(list);

        //Option 3


    }
}
/*
 Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.

                    Take those Strings and put them into a different ArrayList

                    Ex:

                    Input:
                    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”

                    Output:
                    [ tree, loop, cat ]
 */