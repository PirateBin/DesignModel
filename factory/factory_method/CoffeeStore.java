package pattern.factory.factory_method;


public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory=coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        //加料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
