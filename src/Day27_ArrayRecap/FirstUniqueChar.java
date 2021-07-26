package Day27_ArrayRecap;

public class FirstUniqueChar {
    public static void main(String[] args) {

        String str="aaabccddefggggh";//b,e,f,h

        //indeOf9('b')==>3;
        //lastIndexOf('b')==>3;
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
        }

        for(char each:str.replace(" ","").toCharArray()){

            if(str.indexOf(each)==str.lastIndexOf(each)){
                //if the character first and last index of str are same, then the char is unique
                System.out.println(each);
                break;
                //make sure only first UNIQUE char will be printed and system will be executed from printing
            }

        }


    }
}
