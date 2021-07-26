package Day11_SwitchStatement;

public class PassOrFail {
    public static void main(String[] args) {

        char grade ='A';

    /*
    Pass: A, B, C, D
    Fail: F
    a char variable named grade is given.
    use switch statement to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid
     */
        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;


            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Grade");
        }
    }
}
