package pattern.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else{
            throw new RuntimeException("Sorry,the coffee is empty which you ordered");
        }
        //加糖，加奶
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }

}
