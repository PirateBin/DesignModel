package pattern.Observer;

public class Client {
    public static void main(String[] args) {

        //1.创建公众号对象
        SubscriptionSubject subject=new SubscriptionSubject();

        //2.订阅公众号
        subject.attach(new WeiXinUser("Jack"));
        subject.attach(new WeiXinUser("Lucy"));
        subject.attach(new WeiXinUser("Rose"));

        //3.公众号更新，发出消息给订阅者
        subject.notify("hello");

    }

}
