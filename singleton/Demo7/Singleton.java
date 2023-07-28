package pattern.singleton.Demo7;

import java.io.Serializable;

//测试用反射破坏单例模式
public class Singleton implements Serializable {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化时，会自动调用该方法，该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
