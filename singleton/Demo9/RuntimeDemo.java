package pattern.singleton.Demo9;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {

        //获取Runtime对象
        Runtime runtime=Runtime.getRuntime();

        //调用runtime的方法exec，参数是一个命令
        Process process=runtime.exec("ipconfig");

        InputStream is=process.getInputStream();
        byte[] arr=new byte[1024*1024*100];

        int len=is.read(arr);
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
