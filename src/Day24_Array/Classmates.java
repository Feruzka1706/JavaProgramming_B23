package Day24_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Classmates {
    public static void main(String[] args) {
        String[] classmates={"Gulistan","Feruza","Ahmet","Memet","Muhtar","Tamara","Abbos",
                                         "Shirin","Robinson","Shirin"};

        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <= classmates.length-1; i++) {
            //or        i<classmates.length;
            System.out.println(classmates[i].substring(0,3));
        }


    }
}
/*
create string array, and store the names of your  class mates (10)
            print the first three characters of each name
 */