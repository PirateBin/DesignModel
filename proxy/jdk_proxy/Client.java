package pattern.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory proxyFactory=new ProxyFactory();
        //使用工厂对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //调用卖的方法
        proxyObject.sell();
    }
}
