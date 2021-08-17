package cn.tedu.io;

import java.io.*;
import java.rmi.StubNotFoundException;

/** 本类用于测试序列化与反序列化*/
public class TestSerializable {
    /**
     * 序列化：是指把程序中的Java对象，永久保存到磁盘中，相当于写出的过程
     * 对应流的方向：out,对应的序列化流为：ObjectOutputStream
     * 反序列化：是指把之前已经序列化在文件中保存的数据，读取/恢复到程序
     * 对应流的方向：in,对应的反序列化流为：ObjectInputStream
     * */
    public static void main(String[] args) {
        method();//序列化
        method2();//反序列化
    }

    private static void method2() {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream("D:\\ready\\1.txt"));
            //反序列化
            Object o = in.readObject();
            System.out.println(o);
            System.out.println("反序列化成功");
        }catch (Exception e){
            System.out.println("反序列化失败");
            e.printStackTrace();
        }finally {
            try{
                in.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
            //序列化
            Student s = new Student("海绵宝宝",3,"海里",'男');
            out.writeObject(s);
            System.out.println("序列化成功");
        }catch (IOException e){
            System.out.println("序列化失败");
            e.printStackTrace();
        }finally {
            try{
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
