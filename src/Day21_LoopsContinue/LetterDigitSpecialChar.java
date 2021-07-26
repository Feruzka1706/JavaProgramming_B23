package Day21_LoopsContinue;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

       String input ="mn@#123Ab!";


       String letters ="";//mnAb
       String digit ="";//123
       String specialChars="";//@#!

        for (int i = 0; i <=input.length()-1; i++) {
            char each =input.charAt(i);//gets each characters from the string(input)

            if(each>='A'&&each<='Z'){//if the character is upper case letter 
                letters+=each;
            }else if(each>='a'&& each<='z'){//if the character is lower is letter 
                letters+=each;
            }else if(each>='0'&&each<='9'){//if the character is digit 
                digit+=each;
            }else{//if the character is special character 
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("specialChars = " + specialChars);

    }
}
/*
 write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */