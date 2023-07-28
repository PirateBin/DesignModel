package pattern.singleton.Demo2;

public class Client {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();

        //判断两次获取到的singleton是否为同一个对象
        System.out.println(singleton==singleton1);  //true

    }
}
