package pattern.singleton.Demo7;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeObject2File();
        readObject2File();  //pattern.singleton.Demo7.Singleton@27973e9b    pattern.singleton.Demo7.Singleton@27973e9b
        readObject2File();  //pattern.singleton.Demo7.Singleton@312b1dae    pattern.singleton.Demo7.Singleton@27973e9b
        //两次结果不一样，说明破坏了单例模式
        //重写readResolve方法之后就解决了序列号破坏单例模式
    }

    //向文件中写数据(对象)
    public static void writeObject2File() throws IOException {
        //1.获取Single对象
        Singleton instance=Singleton.getInstance();
        //2.创建输出流对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\java\\DesignModel\\TestFile\\a.txt"));
        //3.写出对象
        oos.writeObject(instance);
        //4.关流
        oos.close();
    }

    //从文件中读取数据(对象)
    public static void readObject2File() throws IOException, ClassNotFoundException {
        //1.创建读取流
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\java\\DesignModel\\TestFile\\a.txt"));
        //2.从文件中读取对象
        Singleton instance =(Singleton) ois.readObject();
        System.out.println(instance);
        //3.关流
        ois.close();
    }

}
