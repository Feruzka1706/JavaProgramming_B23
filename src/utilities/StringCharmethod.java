package utilities;

import java.util.Arrays;

public class StringCharmethod {
    public static void main(String[] args) {

        String[] array = {"Said", "SDET", "from", "Cybertek"};
        char ch = 'A';
        array = addElement(array, ch);
        System.out.println(Arrays.toString(array));

    }

    public static String[] addElement(String[] array, char ch) {
        String[] array2 = Arrays.copyOf(array, array.length + 1);//{A,B,null}
        array2[array2.length - 1] = "" + ch; //{A,B,C}


        return array2;

    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];

        int j = 0;
        for (char each : arr1) {
            arr3[j++] = each;
        }

        for (char each : arr2) {
            arr3[j++] = each;

        }
        return arr3;

    }
}
