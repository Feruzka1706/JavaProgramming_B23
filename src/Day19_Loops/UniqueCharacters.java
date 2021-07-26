package Day19_Loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word ="aabccccccdeeeeeeefggggggggh";
        String result="";

        for (int i = 0; i <=word.length()-1 ; i++) {
            char ch =word.charAt(i);//a, a, b, c, c
            boolean isUnique =word.indexOf(ch)==word.lastIndexOf(ch);
           //if the first and last index numbers of characters are same, then the character is unique
            if(isUnique){//if the character is unique
                result+=ch;
            }
        }

        System.out.println("result = " + result);
        
    }
}
