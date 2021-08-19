package day38_CustomClass.pizzaTask;

public class Pizza {
    public char size;
    public int cheeseTopping,numPepperoni;

    public void  customOrder(char size, int cheeseTopping, int numPepperoni) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.numPepperoni = numPepperoni;
    }

    public double calcCost(){
        double startingPrice = (size=='S')? 10 : (size=='M')? 12 : 14;
        double totalPriceOfTopping= 2 *(numPepperoni+cheeseTopping);

        //return (startingPrice+totalPriceOfTopping) *1.08;

        double totalPrice= startingPrice+totalPriceOfTopping * 1.08;//including the tax for last $1.08
       return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", numPepperoni=" + numPepperoni +
                ", total price= $"+ calcCost()+
                '}';
    }
}
