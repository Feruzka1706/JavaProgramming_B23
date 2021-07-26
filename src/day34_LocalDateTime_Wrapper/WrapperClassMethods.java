package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="123";
        int num= Integer.parseInt(str);
        System.out.println(num);
        Integer num0=Integer.parseInt(str); //AutoBoxing


        String str2="456";
        int num2= Integer.valueOf(str2);//unboxing
        //  wrapper class
        System.out.println(num2 -1);//now we can do any calculation with num2 as it's integer data now


        int num3 = Integer.parseInt(str2);//int primitive only none of boxing

        Integer num4 = Integer.valueOf(str);
        //wrapper class


        System.out.println("---------------------------------------------------------------------");

        String str3="true";
        boolean r1 = Boolean.parseBoolean(str3);
        //              primitive
        System.out.println(r1);

        boolean r2 =Boolean.valueOf(str3);
        //            wrapper

        Boolean r3 = Boolean.parseBoolean(str3); //autoboxing


        String str4 ="2.5";
        double d1=Double.parseDouble(str4);

        System.out.println("------------------------------------------------");

        char ch ='4';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter =Character.isLetter(ch);
        boolean isSpecialChar=  !Character.isLetterOrDigit(ch);
        //it means if the charachter is not letter or is not digit

        System.out.println("---------------------------------------------------------------");

        String s ="0a1b2c3";
        int sum =0;

       for(char each: s.toCharArray() ){

           if( Character.isDigit(each)){
               sum +=Integer.parseInt(""+each);
           }
       }

        System.out.println(sum);

        System.out.println("-----------------------------------------------------------------");
        String s2 ="AAABB34BCCC!02@#&^$%@!^&%!05@";

        String letters="",
                digits="",
                specialChars="";

        for(char each: s2.toCharArray() ){

            if( Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else{//if !Character.isDigitOrLetter(each)
                specialChars+=each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);








    }
}
