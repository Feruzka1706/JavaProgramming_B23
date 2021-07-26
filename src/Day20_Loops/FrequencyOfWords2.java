package Day20_Loops;

public class FrequencyOfWords2 {
    public static void main(String[] args) {

        String sentence ="I love books, I purchased a lot of books";
        String word ="book";
        int count =0;
        //"Python"

        for (int i = 0; i <=sentence.length()-word.length(); i++) {
            String each=sentence.substring(i, i+word.length());
            if(each.equalsIgnoreCase(word)){//if the word C# is occured,
                count++;//increase the count by 1
            }

        }

        System.out.println("count= "+count);
    }
}
