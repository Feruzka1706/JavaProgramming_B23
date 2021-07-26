package day03_Variables;

public class Rectangle {

    public static void main(String[] args) {

        int w = 5;
        int l = 20;

        int area = w * l;
        int perimeter = 2 * l + 2 * w;

        System.out.println(area);
        System.out.println(perimeter);

        int w2 = 10;
        int l2 = 20;
        int area2 = w2 * l2;
        int perimeter2 = 2 * l2 * 2 * w2;
        System.out.println(area2);
        System.out.println(perimeter2);


    }
}
// to find the area or perimeter you need to calculate w*l
/* with perimeter the same the first thing that you know is formula
for perimeter formula is: 2*l+2*w
 */