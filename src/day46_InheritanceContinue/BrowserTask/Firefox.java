package day46_InheritanceContinue.BrowserTask;

public final class Firefox extends Browser {

    @Override
    public void open() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox Browser");
    }
}
