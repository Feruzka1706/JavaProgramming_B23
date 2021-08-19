package day41_CustomClass_Constructor;

public class StaticPractice {

    static class Test{
       static int b;
    }
    class TestB{
         int c;
    }

    public static int a =100;

    public static void method1(){

    }

    static {

    }

    public static void main(String[] args) {
        System.out.println(StaticPractice.Test.b);

        //StaticPractice object=new StaticPractice();
        //StaticPractice.TestB object2= new StaticPractice.TestB.;
    }

}
