package day39_Staticvariables_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurantTask {
    public static void main(String[] args) {

         Restaurant restaurant=new Restaurant();
         int numberOfStars=0;

        Server server1=new Server();
        server1.setInfo("John",22,15.60,true);
        Server server2=new Server();
        server2.setInfo("Cici",19,14.80,false);
        Server server3=new Server();
        server3.setInfo("Danieala",25,16,false);
        Server server4=new Server();
        server4.setInfo("Mark",31,15.80,true);
        ArrayList<Server> servers=new ArrayList<>(Arrays.asList(server1,server2,server3,server4) );


        Chef chef1=new Chef();
        chef1.setInfo("Rodger",15,25.40,false);
        Chef chef2=new Chef();
        chef2.setInfo("Patricia",93,22,true);
        Chef chef3=new Chef();
        chef3.setInfo("Becky",17,23.50,true);
        Chef chef4=new Chef();
        chef4.setInfo("Kronck",77,22,false);
        ArrayList<Chef> chefs=new ArrayList<>(Arrays.asList(chef1,chef2,chef3,chef4) );

        restaurant.setInfo("Daniel","San-Fransisco",4, servers,chefs);
        System.out.println(restaurant);

        if(restaurant.servers.size()>=10 && restaurant.chefs.size()>=6){
            numberOfStars=5;
            System.out.println("Up to standard, number of stars "+numberOfStars);
        }else{
            if(restaurant.servers.size()>=7 && restaurant.chefs.size()>=3){
                numberOfStars=4;
                System.out.println("Need to hire more chefs or servers, number of stars "+numberOfStars);
            }else if(restaurant.servers.size()>=4 && restaurant.chefs.size()>=1){
                numberOfStars=3;
                System.out.println("Need to hire more chefs or servers, number of stars "+numberOfStars);
            }
        }





    }
}
/*
Create a class LocalRestaurant that has a main method with the following:
        	- Make a Restaurant object
        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

            - Print your whole restaurants information

        Extra Tasks:
        	- Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates

        	- Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time.
        	Their position of server or chef does not matter for these ArrayList, only their employment status

        	- Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers

            	- if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message:
            	"Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"

 */