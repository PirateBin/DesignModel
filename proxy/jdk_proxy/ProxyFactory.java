package pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//获取代理对象的工厂类
//代理类也实现了对应的接口
public class ProxyFactory {

    //声明目标对象
    private TrainStation station=new TrainStation();

    public SellTickets getProxyObject(){
        /*
            ClassLoader loader:类加载器，用于加载代理类
            Class<?>[] interfaces:代理类实现的接口的字节码对象
            InvocationHandler h:代理对象的调用处理程序
         */
        //返回代理对象
        SellTickets proxyObject=(SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    //参数一：代理对象，基本不用
                    //参数二：对接口中的方法进行封装的method方法
                    //参数三：调用方法的实际参数
                    //返回值就是方法的返回值
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的服务费用(JDK动态代理)");
                        //执行目标对象的方法
                        Object obj=method.invoke(station,args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }

}
