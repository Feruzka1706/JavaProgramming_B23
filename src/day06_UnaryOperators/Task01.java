package day06_UnaryOperators;

public class Task01 {
    public static void main(String[] args) {
        int a = 50;
        a= --a + a++ + a-- + a++;
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);
    }
}
