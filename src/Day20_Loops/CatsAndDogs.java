package Day20_Loops;

public class CatsAndDogs {
    public static void main(String[] args) {
        String sentence ="Cat Dog Dog Cat Cat Cat Cat Cat Cat Cat";

        int numberOfCats=0;//"Cat"
        int numberOfDogs=0;

        for(int i =0; i<=sentence.length()-3;i++){//i: 0 -14
            String each =sentence.substring(i,i+3);//has three characters
            if(each.equalsIgnoreCase("Cat")){
                numberOfCats++; 
            }
            
            if(each.equalsIgnoreCase("Dog")){
                numberOfDogs++;
            }
            
        }

        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberOfDogs = " + numberOfDogs);

        boolean equal =numberOfCats==numberOfDogs;
        System.out.println(equal);
    }

}
