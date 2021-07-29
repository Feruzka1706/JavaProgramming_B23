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
    }

    public void scratch(String furniture){
        System.out.println(name+" is scratch "+furniture);
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
    public void drink(String drink){
        System.out.println(name+" drinks water "+drink);
    }
    public void meow (String frequency){
        System.out.println(name+" meow "+frequency);
    }
    public void annoy(){
        System.out.println(name+" favorite hobby is annoying me :)))))");
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
