package day46_InheritanceContinue.BrowserTask;

public class BrowserObject {

    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.open();

        System.out.println("====================================================================");

        Firefox firefox=new Firefox();
        firefox.open();
    }
}
