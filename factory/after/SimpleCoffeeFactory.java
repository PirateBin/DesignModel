package pattern.factory.after;

//简单咖啡工厂，用来生产咖啡
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee=null;
        if("American".equals(type)){
            coffee=new AmericanCoffee();
        }else if("Latte".equals(type)){
            coffee=new LatteCoffee();
        }else {
            throw new RuntimeException("Sorry,the coffee is empty which you ordered");
        }

        return coffee;
    }
}
