package Practice_07_21_2021;

public class MethodsOverloading {
    public static void main(String[] args) {

    }
}
/*
if a class has multiple methods with same it is called method overloaading
        Adv :
                - Reusabilty
                - Flexible
                - Readable
                - Easy to memorize
                        Bad Practice : sum1(int a,int b)     sum2(double a, double b)
                        Good Practice: sum(int a,int b)      sum(double a, double b)
        Rules :
                - Number of Prameters -- OVERLOADING
                    add(int a,int b );
                    add(int a);
                - Dataypes of Paramters -- OVERLOADING
                    add(int a,float b);
                    add(int a,int a);
                - Sequrnce of Paramters -- OVERLOADING
                    add(int a,float b);
                    add(float a,int b);
                - Return Type           -- Invalid Case
                    int   add(int a,float b);
                    float add(float a,int b);
 */