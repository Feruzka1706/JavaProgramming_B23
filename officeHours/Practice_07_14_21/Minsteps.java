package Practice_07_14_21;

public class Minsteps {
    public static void main(String[] args) {
        String[] arr={"x/","y/","../","z/","./","a/"};

        System.out.println(minStep(arr));

    }
    public static int minStep(String[] str){
        int count=0;
        for(String each:str){

            if(each.equals("../")){
                count--;//3-1=2;
            }else if(each.equals("./")){

            }else{
                count++;

            }
        }


        return count;
    }
}
/*
 Number of Steps to Main directory  --- Interview Task

    			 We have a record of every time a change of directory is performed.
    			 The different change directory functions are as follow ;
    				 ../Move to parent folder of current folder   -1
    				 ./Remain in the same folder                  no need change counter
    				 x/Move to the child folder named x           1
    				 Write a method to Find the minimum steps required to go back to main directory from current folder.
    				 The sequence of operations performed after entering the main directory provided
    				 Input : {"x/","y/","../","z/","./"}
    				 Output : 2
 */
