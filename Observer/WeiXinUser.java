package pattern.Observer;

//具体观察者角色类
public class WeiXinUser implements Observer{

    String name;

    public WeiXinUser(String name){
        this.name=name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name+"接收到了"+msg);
    }
}
