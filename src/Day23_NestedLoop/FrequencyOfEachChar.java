package Day23_NestedLoop;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String word="aabccc";
        String removeDub=""; // a b c
        /*
        if(!removeDub.contains("a")){
            removeDub+="a";
        }
        if(!removeDub.contains("b")){
            removeDub+="b";
        }
         */

        for (int i = 0; i <=word.length()-1 ; i++) {
            char ch=word.charAt(i);

            if(removeDub.contains(""+ch)){
                //if the character is already contained in removeDub
                continue;
            }
            removeDub+=ch;
        }
        System.out.println(removeDub);


        String result=""; //a2b1c3  ==>aabccc



        for (int j = 0; j <=removeDub.length()-1 ; j++) {//abc
            //we are using outer loop for getting each characters from string

            int frequency = 0;//for the frequency of ch
            char ch = removeDub.charAt(j); //'a''b''c'
            for (int i = 0; i < word.length() - 1; i++) {
                //inner loop is responsible for returning the frequency of ch
                char each = word.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }
          result+=""+ch+frequency;//a2b1c3
        }

        System.out.println(result);


        //System.out.println(removeDub);
    }
}
