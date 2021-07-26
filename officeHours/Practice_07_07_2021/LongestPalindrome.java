package Practice_07_07_2021;

public class LongestPalindrome {
    public static void main(String[] args) {

        String[] words={"java", "longer word", "civic", "apple", "racecar", "mom","anna"};
        String longestPalindrome="";

        for(String each:words){
            boolean isPlaindrome=true;
            String reverse="";
            for (int i = each.length()-1; i>=0 ; i--) {
                reverse+=each.charAt(i);

            }
            isPlaindrome=reverse.equalsIgnoreCase(each);

            if(isPlaindrome && each.length()>longestPalindrome.length()){
                longestPalindrome=each;
            }
        }
        System.out.println(longestPalindrome);
    }
}
/*
 For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
                    Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
 */