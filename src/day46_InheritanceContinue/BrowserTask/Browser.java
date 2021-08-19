package day46_InheritanceContinue.BrowserTask;

public class Browser {


public  void open(){
    System.out.println("Opening Chrome Browser");

}
public void close(){
    System.out.println("Closing Chrome Browser");
}

public final  void navigate(String url){
    System.out.println("Type: "+url);
    System.out.println("Press Enter");

}

public final void refresh(){
    System.out.println("F5");

}

public final void backward(){

    System.out.println("backward");

}

public  final void forward(){

    System.out.println("forward");
}


}
/*
open()
close()
navigate()
refresh()

 chrome1.navigate("google.com")//navigate() should be instance as each object has its own copy!
 chrome2.navigate("facebook")

BrowserTask
	Create the following custom classes:
	1. Chrome
			methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser(): prints "closing chrome browser"

	2. FireFox
			methods:
				openBrowser(): prints "opening firefox browser"
				closeBrowser(): prints "closing fire fox browser"

	3. Opera
			methods:
				openBrowser(): prints "opening opera browser"
				closeBrowser(): prints "closing opera browser"

	4. Safari
			methods:
				openBrowser(): prints "opening safari browser"
				closeBrowser(): prints "closing safari browser"
 */