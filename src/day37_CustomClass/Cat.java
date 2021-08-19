package day37_CustomClass;

public class Cat {
    public String name;
    public String color;
    public String gender;
    public String breed;
    public String size;
    public int age;


    public static void main(String[] args) {

        Cat cat1= new Cat();
        cat1.setInfo("Vasya","black-white","male","Domestic regular","large",12);
        cat1.getInfo();

        cat1.scratch(" Sofa and chair");
        cat1.breakThings(" all stuff in the kitchen");
        cat1.annoy();
        cat1.jump(" around inside houses");
        cat1.meow(" all the time");
        cat1.drink(" milk");
        cat1.eat(" fish, meat, and good stuff");
        System.out.println("-----------------------------------------------------------------------------");

        Cat cat2=new Cat();
        cat2.setInfo("Misha","grey","male","Russian blue","large",5);
        cat2.getInfo();
        cat2.eat("special can food");
        cat2.drink("milk and water");
        cat2.scratch("my hand :((((((");
        cat2.breakThings("everything");
        cat2.jump("outside and and on my bed");
        cat2.meow("when is hungry");
        cat2.annoy();


    }



    public void scratch(String furniture){
        System.out.println(name+" scratches "+furniture);
    }
    public void breakThings (String things){
        System.out.println(name+" loves break "+things);
    }
    public void jump (String places){
        System.out.println(name+" jump "+places);
    }
    public void eat(String food){
        System.out.println(name+ " likes to eat "+food);
    }
    public void drink(String catDrinks){
        System.out.println(name+" drinks "+catDrinks);
    }
    public void meow (String frequency){
        System.out.println(name+" meow "+frequency);
    }
    public void annoy(){
        System.out.println(name+" favorite hobby is annoying me :)))))");
    }

    public void setInfo(String catName, String catColor, String catGender, String catType, String catSize, int catAge){
        name=catName;
        color=catColor;
        gender=catGender;
        breed=catType;
        size=catSize;
        age=catAge;

    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
        System.out.println("breed = " + breed);
        System.out.println("size = " + size);
        System.out.println("age = " + age);
    }
}
