package Practice_09_06_2021;

public class LetterTask {
    public static void main(String[] args) {
        char ch='!';
        String result="";
        
        if(ch>='A'&& ch<='Z'){
            result=ch+ " is an Upper case character";
        }else if(ch>='a' && ch<='z'){
            result=ch+ " is an Lower case character";
        }else{
            result=ch+ " is not an alphabet character";
        }
        System.out.println("result = " + result);

    }
}
/*
 Given a character, the task is to check whether the given character is in upper case,
  lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character

 */