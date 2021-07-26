package Day23_NestedLoop;

public class MyClassmates {
    public static void main(String[] args) {
        //if we know what are the elements are
        String[] friends ={"Sabir","Ahmet","Tugba","Beryl","Ahmet"};
        System.out.println("Size: "+friends.length);
        //                               length ==> is not method here, it's variable

        for (int i = 0; i <= friends.length-1; i++) {
            System.out.println( friends[i] );
        }

        System.out.println("---------------------------------------------");
        //if we don't know what are the elements are, but we know how many elements we want to store
        String [] friends2=new String[5];//size 5
        //arrays size has to be fixed!!
        System.out.println("Size: "+friends2.length);
        friends2[0]=" ";//it will give empty space result;
        friends2[1]="Mohammed";
        friends2[2]="Komiljon";
        friends2[3]="Esra";
        friends2[4]="Kemal";

        //friends2[5]="Muhtar";
        //Array's size is fixed we can't add additional data , it will be out of bound

        for (int i = 0; i <= friends2.length-1 ; i++) {
            System.out.println(friends2[i]);
        }
    }
}
