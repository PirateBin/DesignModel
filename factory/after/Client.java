package pattern.factory.after;

public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("Latte");
        System.out.println("咖啡:"+coffee.getName());
    }
}
