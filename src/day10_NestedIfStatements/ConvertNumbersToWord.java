package day10_NestedIfStatements;

public class ConvertNumbersToWord {
    public static void main(String[] args) {
        //0-9
        //zero, one, two, three, four, five, six, seven, eight, nine, invalid ==11
        int number=100;
        String word="";

        if(number>=0 && number<=9) {
            if (number == 0) {
                word = "Zero";
            } else if (number == 1) {
                word = "One";
            } else if (number == 2) {
                word = "One";
            } else if (number == 3) {
                word = "One";
            } else if (number == 4) {
                word = "One";
            } else if (number == 5) {
                word = "Five";
            } else if (number == 6) {
                word = "One";
            } else if (number == 7) {
                word = "One";
            } else if (number == 8) {
                word = "One";
            } else {
                word = "Nine";

            }
        }else{//if number is invalid
            word="Are you stupid??? The number you put is invalid!";
        }

        System.out.println(word);


    }
}
