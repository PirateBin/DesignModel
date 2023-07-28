package pattern.singleton.Demo5;

//静态内部类

/*
    静态内部类单例模式由内部类创建，由于JVM在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性/方法被调用时
    才会被加载，并初始化静态属性，静态属性由于是被static修饰，保证制备实例化一次，并且按严格实例化顺序
 */
public class Singleton {
    private Singleton() {}

    //定义一个静态内部类
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE=new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
