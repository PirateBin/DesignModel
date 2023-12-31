package pattern.factory.after;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory=new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
