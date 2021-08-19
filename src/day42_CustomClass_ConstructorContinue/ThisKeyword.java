package day42_CustomClass_ConstructorContinue;

public class ThisKeyword {

    int a;//instance variable
    static int b;//static variable
    public void method1(){
        System.out.println("Instance method");
    }

    public static void method2(){
        System.out.println("Static method");
    }

    public ThisKeyword(){
        System.out.println( this.a );
        //this.method1();

        //System.out.println(this.b);//NEVER USE IT


    }
}
