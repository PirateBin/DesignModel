package pattern.singleton.Demo8;


public class Singleton {

    private static boolean flag=false;
    private Singleton(){
        //解决反射导致破坏单例模式
        synchronized (Singleton.class) {
            //判断flag是否为true，如果是说明不是第一次访问，抛出异常
            //如果是false，说明是第一次创建
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag设置为true
            flag = true;
        }
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
