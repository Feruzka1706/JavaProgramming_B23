package day30_Recap;

public class LoopsReview {
    public static void main(String[] args) {

        //int i;//in this case we can use i outside of loop
        for ( int i = 1; i <11 ; i++) {//i: 1,2,3,4,5,6,7,8,9,10,11
            //make sure put VALID condition, and ITERATOR is also important!
            System.out.print(i+" ");
            //we CAN'T USE i value outside of loop
        }
        System.out.println();

        System.out.println("ABC".charAt(2));//2==C
        System.out.println("-----------------------------------------");

        for (int i = 1; i <=20; i++) {//i:1,2,3,4,5,6,7,8,9,10,11,12,13,....20

            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");

        String str="Java";
        //          0123

        for (int i = 0; i <=str.length()-1 ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("-------------------------------------------------");

        for (int i = 1, ch=65; i<=26; i++, ch++) {
            System.out.println(i+". "+(char)ch);
            //(char) ch is casting ==> becomes int to char
        }
        System.out.println("-------------------------------------");

        for (int i = 26, ch=90; i >=1; i--, ch--) {
            System.out.println(i+". "+(char)ch);
        }
        System.out.println("--------------------------------------------------");

        for (char i = 'A', j='a'; i <='Z'; j++, i++) {
            System.out.println(i+"-"+j);
        }

        System.out.println("---------------------------------------------");

        String word="Python";
        String reverse="";


        for (int i = word.length()-1; i>=0; i--) {//i: index nums of word(in reversed order)
            reverse+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reverse);
        System.out.println("isPalindrome = " + isPalindrome);


    }
}
