package Day27_ArrayRecap;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] scrum1={"Komiljon", "Yuliang", "Merve", "Nadima"};
        //                   0           1          2         3
        String[] scrum2={"Sabir", "Tamara"};
        //                  0         1
        String[] scrum3={"Tugba", "Hilal", "Dilem"};
        //                  0        1        2
        String[][] scrumTeams={scrum1,scrum2,scrum3};//length:3
        //                      0       1       2
        System.out.println(Arrays.deepToString(scrumTeams));

       //{"Komiljon", "Yuliang", "Merve", "Nadima"}
        System.out.println( Arrays.toString(scrumTeams[0]) );
        //to print the first single dimensional arrays index numbers

        //Tamara
        System.out.println( scrumTeams[1][1] );
        //element = no need ---> 1D array = toString ---> 2d++ arrays = deepToString.


        System.out.println("-----------------------------------");

        for(String[] eachScrum :scrumTeams){
            //System.out.println(Arrays.toString(eachScrum));
            for (String eachMember:eachScrum){
                System.out.print(eachMember+" ");
            }
        }

        System.out.println("\n--------------------------------------------");

        for (int i = 0; i < scrumTeams.length ; i++) {
            for (int j = 0; j < scrumTeams[i].length; j++) {
                //J: index of each single element

                System.out.print(scrumTeams[i][j]+" ");

            }
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        int[] numbers={1,2,3,4,5};//{5,2,3,4,1};

        int temp=numbers[0];//1
        numbers[1]=numbers[3];//[5,2,3,4,5]

        numbers[3]=temp;//[5,2,3,4,1]
        System.out.println(Arrays.toString(numbers));
    }
}
