package pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore coffeeStore=new CoffeeStore();
        //设置咖啡工厂
        //coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        //点咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
