package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s=10;
        int num=s;

        Integer num2 =(int) s; // Autoboxing ==converting primitive value to wrapper class
        // with casting we can convert it ONLY
        //otherwise we CANNOT USE it

         char ch ='@';
         Character ch2=(Character) ch;  //Autoboxing ==it will be done automatically


        Byte b1=10;
        byte b2=b1;
        short b3=b1;
        int b4 =b1;
        long b5=b1;
        float b6=b1;
        double b7=b1;
        // Unboxing process

        System.out.println("---------------------------------------------------------------");

        byte c1=10;
        Byte c2=c1; //wrapper class only accepts it's own primitive ==AUTOBOXING

       // Short c3=c1;//short wrapper class DOESN"T ACCEPT any other primitives than own primitives



    }
}
