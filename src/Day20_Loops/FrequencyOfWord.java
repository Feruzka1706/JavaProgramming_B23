package Day20_Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence ="Java Java";
                  //index:012345678
        int count =0;
        //"Java"
        /*
        String str1=sentence.substring(0,4);//"java"
        String str2=sentence.substring(1,5);//"ava "
        String str3=sentence.substring(2,6);//"va J"
        String str4=sentence.substring(3,7);//"a Ja"
         */
        for (int i = 0; i < sentence.length()-4; i++) {//i: 0 1 2 3 4 5 6 7 8
            String each =sentence.substring(i, i+4);
            System.out.println(each);
            count++;
        }

    }
}
