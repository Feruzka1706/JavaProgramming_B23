package day42_CustomClass_ConstructorContinue;

public class ConstructorCalls {

    public static void method1(){
        System.out.println("Method1");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
    }

    public static void method4(){
        method1();
        method2();
    }

    public static void method3(){
        // ConstructorCalls(); //to call constructor we need to use THIS keyword
        //this().
    }

    public ConstructorCalls(){
        method1();
        method2();
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
       this();//calling no argument constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this();
        //this(10);
        System.out.println("Constructor with str arg");
    }


    public static void main(String[] args) {

        method2();


        System.out.println("==========================================================================");

        new ConstructorCalls();

        System.out.println("------------------------------------------------");
        new ConstructorCalls(10);

    }







}
