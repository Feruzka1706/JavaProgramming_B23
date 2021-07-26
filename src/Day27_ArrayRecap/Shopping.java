package Day27_ArrayRecap;

public class Shopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        //1.find out the first index of "Gloves" 9for loop)

        for (int i = 0; i < items.length ; i++) {
            if(items[i].equals("Gloves")){
                System.out.println(i);
                break;
                //after printing the first index of "Gloves it will stop after the first index of gloves
            }
        }
        //2.find out if"iPad" is contained in the item list (fot loop || for each loop
        boolean hasIpad=false;
        for(String eachItem:items){
            if(eachItem.equals("iPad")){
                hasIpad=true;
            }
        }
        System.out.println(hasIpad);

       //3. Print a report of each shopping item name - price -#ID
        for (int j = 0; j <itemIDs.length ; j++) {
            System.out.println(items[j]+" - $"+prices[j]+" - #"+itemIDs[j]);
        }


    }
}
/*
Given:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print a report of each shopping item
            name - price -#ID
 */