package Day26_MultiDimensionalArray;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {

        String[][][][][] names={ {  {{{"Viktoria", "Feruza"},{"Koray", "Break"} },
                {{"Komiljon", "Yasin"}}}   ,{ {{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }} } };

        System.out.println(Arrays.deepToString(names));

        //{{"Viktoria", "Feruza"}, {"Koray", "Break"} }
        //System.out.println(Arrays.deepToString(arr5D[0][0][0]));

        for (String[][][][] each4D : names) {
            for (String[][][] each3D : each4D) {
                for (String[][] each2D : each3D) {
                    for (String[] each1D : each2D) {
                        for (String element : each1D) {
                            System.out.println(element);
                        }

                    }
                }
            }
        }

        System.out.println();
        System.out.println(names[0][0][0][0][1]);//to print one name "Feruza"




    }
}
/*
String[][][][][] names = { {  {{{"Viktoria", "Feruza"},{"Koray", "Break"} },
 {{"Komiljon", "Yasin"}}}   , { {{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }}} };
 */