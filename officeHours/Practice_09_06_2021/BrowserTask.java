package Practice_09_06_2021;

public class BrowserTask {
    public static void main(String[] args) {

        String browserName = "chrome";
        String operatingSystem = "Mac";
        boolean isBrowserOpen = true;


        if(isBrowserOpen==false){

            switch (browserName){
                case"chrome":
                case"chrome-headless":
                case "firefox":
                case "firefox-headless":
                case "remote-chrome":
                    System.out.println("Browser is opened successfully with "+browserName+
                            " in "+operatingSystem);
                    break;
                case "ie":
                case "edge":
                    if(operatingSystem=="Windows"){
                        System.out.println("Browser is opened successfully with "+browserName+
                                " in "+operatingSystem);
                    }else{
                        System.out.println("Your "+operatingSystem+" doesn't support "+browserName);
                    }

                    break;
                case "safari":
                    if(operatingSystem!="windows"){
                        System.out.println("Browser is opened succesfully with "+browserName+
                                " in "+operatingSystem);
                    }else{
                        System.out.println("Your "+operatingSystem+ " doesn't support "+
                                browserName);
                    }
                    break;
            }


        }else{

        }

        System.out.println("Browser is already opened with "+browserName+
                " in "+operatingSystem);


    }

}
/*
Task  : Create  a program that accepts browserName and operatingSystem as String and isBrowserOpen as boolean
				        If the Browser is closed, try to open the corresponding browsers in that operating system to run your code.
				        		=== These browsers can be opened in these operatingSystem ===
				                    chrome   		    --- > mac - windows
				                    chrome-headless 	--- > mac - windows
				                    firefox-headless    --- > mac - windows
				                    firefox             --- > mac - windows
				                    remote-chrome  		--- > mac - windows
				                    ie 					--- > windows
				                    edge 				--- > windows
				                    safari 			    --- > mac
				                    According to related browserName and operatingSystem it should give
				                    	"Browser is opened successfully with $browserName in $operatingSystem"
				                    if operatingSystem does not support $browserName
				                    	"Your $operatingSystem doesn't support ie"
				         If the Browser is already opened it should give an error message
				        	"Browser is already opened with $browserName in $operatingSystem"
				                    EXAMPLES
				                    INPUTS :
				                            isBrowserOpen=false
				                            browserName=chrome
				                            operatingSystem=mac
				                EXPECTED OUTPUT : Browser is opened successfully with chrome in mac

				                    INPUTS :
				                            isBrowserOpen=false
				                            browserName=chrome
				                            operatingSystem=windows
				                EXPECTED OUTPUT : Browser is opened successfully with chrome in windows

				                    INPUTS :
				                            isBrowserOpen=false
				                            browserName=ie
				                            operatingSystem=mac
				                EXPECTED OUTPUT : Your mac doesn't support ie

				                    INPUTS :
				                            isBrowserOpen=false
				                            browserName=edge
				                            operatingSystem=mac
				                EXPECTED OUTPUT : Your mac doesn't support edge

				                   INPUTS :
				                            isBrowserOpen=false
				                            browserName=safari
				                            operatingSystem=windows
				                  EXPECTED OUTPUT : Your windows doesn't support safari

				                   INPUTS :
				                            isBrowserOpen=true
				                            browserName=safari
				                            operatingSystem=mac
				                 EXPECTED OUTPUT : Browser is already opened with safari in mac

 */
