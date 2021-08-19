package day44_RecapEncapsulation.personTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonTask {

    private String name;
    private char gender;

    private final int age;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;

     public final static  boolean isHuman;
     public  final static  String planet;

   static {
       isHuman=true;
       planet="Earth";
   }


    public PersonTask(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {

        setName(name);
        setGender(gender);
        if(dateOfBirth.isBefore(LocalDate.now() ) ){
            this.dateOfBirth = dateOfBirth;
        }else{
            this.dateOfBirth=null;
        }

        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age=LocalDate.now().getYear() -dateOfBirth.getYear();
    }

    public String getName(){//getter doesn't have any parameter
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if( !(gender =='M' || gender =='F' || gender=='m' || gender=='f') ){
            //if the gender is not match any of these , then the method will exist
            return;
        }
        this.gender = gender;
    }

    public void eat(String food ){
        System.out.println(name+" eats a lot of "+food);
    }

    public void sleep(){
        System.out.println(name+" sleeps a lot too");
    }

    public void drink(String drinks ){
        System.out.println(name+" drinks "+drinks);
    }

    public String toString() {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        return "PersonTask{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth.format(df) +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                ", isHuman=" + isHuman +
                ", planet=" + planet +
                '}';
    }
}
/*
PersonTask:
    private variables:
        name (String)
        gender (char and constant)
        age (int)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)
        isHuman (static boolean & constant)
        planet (static boolean & constant)

    Encapsulate all the fields (instances)
        (age cannot be set to negative)

    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)

     Extra methods:
         eat(), sleep(), drink(), toString()
 */