package day43_OOP_Encaplsulation;

public class EncapsulationIntro {

    private String username ="Cybertek",
                  password="Cybertek123";


    public String getUsername(){
        //allows us to READ private data outside of class !!!
        //it gets the data outside of class and read it
        return username;
    }

    public String getPassword(){
        //allows us to READ private data outside of class !!!
        //it gets the data outside of class and read it
        return password;
    }

    public void setUsername(String username) {
        if(username.length()<5){
            System.out.println("Username needs to be at least 8 characters long");
            return;
        }
         this.username=username;
    }

    public void setPassword(String password){
        if( password.length()<8 ){
            System.out.println("Password need to be at least 8 characters long");
            return;
        }
        this.password=password;
    }
}
