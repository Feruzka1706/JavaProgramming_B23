package day25_ForEachLoop;

public class ReverseElement2 {
    public static void main(String[] args) {
        String[] array={"Java","Python","C#","Selenium","SQL"};
        String reverse="";
        for (String element : array) {

            for (int i = element.length()-1; i>=0 ; i--) {
                reverse+=element.charAt(i);
            }


        }
        System.out.println(reverse);

    }
}
