package day30_Recap;

public class NestedLoopReview {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        String str="aabcccd";

        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);
            int frequency=0;

            for (int i = 0; i <str.length(); i++) {
                if(str.charAt(i)==ch){
                    frequency++;
                }
            }

            if(frequency==1){
                System.out.print(ch);
            }

        }
        System.out.println();

        //System.out.println(frequency);

    }
}
