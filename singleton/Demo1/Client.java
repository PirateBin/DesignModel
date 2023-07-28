package pattern.singleton.Demo1;

public class Client {
    public static void main(String[] args) {

        //1.创建Singleton类对象
        Singleton singleton=Singleton.getInstance();

        Singleton singleton1=Singleton.getInstance();

        //2.判断获取到的两个对象是否是同一个对象
        System.out.println(singleton1==singleton);  //true
    }
}
