package pattern.singleton.Demo3;

//懒汉式
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量
    private static Singleton instance;

    //对外提供访问方式
    public static synchronized Singleton getInstance(){
        //判断instance是否为null，如果为null则创建，如果不为null则直接返回
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}
