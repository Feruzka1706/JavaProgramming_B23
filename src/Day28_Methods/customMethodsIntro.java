package Day28_Methods;

public class customMethodsIntro {
//we can create here own method or outside of main method

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Muhtar");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        customMethodsIntro.printHello5Times();

    }

    public static void printHello5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello");
        }
    }
    //this is our own method

}
