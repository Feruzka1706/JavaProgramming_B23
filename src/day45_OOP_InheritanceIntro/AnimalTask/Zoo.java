package day45_OOP_InheritanceIntro.AnimalTask;

public class Zoo {

    public static void main(String[] args) {
        Dog dog=new Dog("Lucy", "Hucky",'F',"Small",2,"white");
        dog.bark();
        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();
        System.out.println(dog);
        System.out.println(Dog.breathe);
        System.out.println(Dog.sleep);

        System.out.println("======================================================================================");

        Cat cat=new Cat("Fate","Van",'F',"medium",4,"white");
        cat.meow();
        cat.eat("fish");
        cat.drink("milk");
        cat.sleep();
        System.out.println(cat);

        System.out.println("============================================================================================");

        Tiger tiger =new Tiger("Leo","Bengal",'M',"large",6,"white");
        tiger.roar();
        tiger.eat("humans' meat");
        tiger.drink("water");

        System.out.println(Tiger.sleep);
        System.out.println(Tiger.breathe);
    }
}
