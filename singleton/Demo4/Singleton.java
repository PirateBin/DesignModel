package pattern.singleton.Demo4;

//双重检查锁方式
public class Singleton {

    private Singleton(){}

    //利用volatile保证instance的可见性和有序性
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //第一次判断,如果instance不为null，不需要抢占锁，直接返回对象
        if(instance==null){
            synchronized(Singleton.class){
                //抢到锁之后再次判断是否为null
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }

        return instance;
    }

}
