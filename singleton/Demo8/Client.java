package pattern.singleton.Demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //1.获取Singleton的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //2.获取无参构造方法
        Constructor cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建Singleton对象
        Singleton s1=(Singleton) cons.newInstance();
        Singleton s2=(Singleton) cons.newInstance();

        System.out.println(s1==s2); //false
        //破坏了单例模式

    }
}
