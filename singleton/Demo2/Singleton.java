package pattern.singleton.Demo2;

//饿汉式
//静态代码块
public class Singleton {

    private Singleton(){}

    //声明Singleton类型的变量
    private static Singleton instance;  //null

    //在静态代码块中赋值
    static{
        instance=new Singleton();
    }

    //对外提供获取该类对象的访问方法
    public static Singleton getInstance(){
        return instance;
    }
}
