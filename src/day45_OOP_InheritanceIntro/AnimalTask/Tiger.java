package day45_OOP_InheritanceIntro.AnimalTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Tiger extends Animal {
    public Tiger(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }//Tiger is animal

    /*
    public Tiger(String name, String breed, char gender,String size, int age, String color){
        setInfo(name, breed, gender, size, age, color);
    }
     */

    public void roar(){
        System.out.println(name+" is roaring!");
    }


}

