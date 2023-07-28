package pattern.Observer;

import java.util.ArrayList;
import java.util.List;

//具体主题类
public class SubscriptionSubject implements Subject{

    //定义一个集合用来存储多个观察者对象
    private List<Observer> weiXinUserList=new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        //遍历集合，通知所有观察者
        for(Observer observer:weiXinUserList){
            observer.update(msg);
        }
    }
}
