package Day08_LogicalOperators;

public class OddOrEvenReplit {
    public static void main(String[] args) {
        int number = 10;
        boolean even = number%2==0;
        boolean odd = number%2!=0;
        if(even){
            System.out.println(number+ " is even");
        }
        if(odd){
            System.out.println(number+ " is odd");
        }
    }
}
