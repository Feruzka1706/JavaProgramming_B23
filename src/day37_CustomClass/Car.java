package day37_CustomClass;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int price;
    public int year;
    public boolean backCamera;


    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Mercedes benz","CLA","dark grey",35000, 2020,true);
        car1.getInfo();
        car1.autoParking(false);
        car1.drive(false);
        car1.speed(true);
        System.out.println("--------------------------------------------------------------------------------------");


        Car car2=new Car();
        car2.setInfo("Tesla","S","white",120000,2021,true);
        car2.getInfo();
        car2.autoParking(true);
        car2.drive(true);
        car2.speed(true);
        System.out.println("------------------------------------------------------------------------------------");

        Car car3=new Car();
        car3.setInfo("Lexus","250i","red",35600,2019,true);
        car3.getInfo();
        System.out.println("--------------------------------------------------------------------------------");

        Car car4=new Car();
        car4.setInfo("Honda","Civic","dark blue",21000,2018,true);
        car4.getInfo();


    }


    public void drive(boolean selfDrive){
        System.out.println(brand+", "+model+" has self drive option= "+selfDrive);
    }

    public void autoParking(boolean parkingType){
        System.out.println(brand+", "+model+" can park automatically= "+parkingType);
    }
    public void speed(boolean speedLimit){
        System.out.println(brand+", "+model+" can go over more than 300 mileages per hour= "+speedLimit);
    }

    public void getInfo(){
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("year = " + year);
        System.out.println("backCamera = " + backCamera);
    }

    public void setInfo(String autoBrand, String carModel, String carColor, int carPrice, int carYear, boolean accessCamera){
        brand=autoBrand;
        model=carModel;
        color=carColor;
        price=carPrice;
        year=carYear;
        backCamera=accessCamera;
    }
}
