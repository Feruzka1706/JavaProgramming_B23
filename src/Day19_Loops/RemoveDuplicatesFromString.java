package Day19_Loops;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String word="abababababcbacccabcbbccabc";
        String result="";//"ab";

        for (int i = 0; i <word.length() ; i++) {//or i<=word.length()-1;
            if(!result.contains(""+word.charAt(i)))
          //if the character is not contained in the result yet
             result+=word.charAt(i);
        }

        System.out.println("result = " + result);

    }
}
