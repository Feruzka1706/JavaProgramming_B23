package day43_OOP_Encaplsulation;

public class Credentials {

   private String username, password;

    public Credentials(String username, String password) {
       setUsername(username);//only sets the username, if username starts with letter && username at least 5 characters long
       setPassword(password);//only sets the password , if the password is strong password
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
       boolean startsWithLetter =Character.isLetter(username.charAt(0) );

       if( !startsWithLetter || username.length()<5){
           return;
       }
        this.username = username;
    }

    public void setPassword(String password) {
        if( !isStrongPassword(password) ){
            //if the given password is not strong password
            //return statement will exist the method
            return;
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static boolean isStrongPassword(String password){
        boolean password1=password.length()>=8 &&  !password.contains(" ") && !password.contains(",");
        boolean r2=false;
        boolean r3=false;
        boolean r4=false;

        for(char each :password.toCharArray() ) {
            if(Character.isLetter(each) ){//if char is letter
                r2=true;
            }else if( !Character.isLetterOrDigit(each) ){// if char is special char
                r3=true;
            }else{//if the char is digit
               r4=true;
            }
        }

        return password1 && r2 && r3 && r4;
    }


}
/*
create a class named Credentials
            variables:
                username, password


                username:
                        1.MUST start with a letter
                        2.Must have 5 character letter

            methods:
                isStrongPassWord(): takes an argument of string and verifys if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString()
 */