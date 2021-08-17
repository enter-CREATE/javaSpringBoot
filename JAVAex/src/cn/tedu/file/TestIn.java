package cn.tedu.file;

import java.io.*;

/** 本类用于测试字节流的读取*/
public class TestIn {
    public static void main(String[] args) {
        //method();//普通字节流的读取
        method2();//高效字节流的读取
    }

    private static void method2() {
        BufferedInputStream in = null;
        try{
            in = new BufferedInputStream(
                    new FileInputStream("D:\\ready\\1.txt"));
            int b;//记录读取的数据
            while ((b = in.read()) != -1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();//打印错误信息
            /**finally代码块是try-catch结构中一定会执行到的部分
             * 常用于关流操作，为了防止因发生异常没有正确关流，不能写
             * 在try{}当中，这点需要注意*/
        } finally {
            try{
                in.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        InputStream in = null;
        try{
            in = new FileInputStream("D:\\ready\\1.txt");
            int b;//记录读取的数据
            while ((b = in.read()) != -1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();//打印错误信息
            /**finally代码块是try-catch结构中一定会执行到的部分
             * 常用于关流操作，为了防止因发生异常没有正确关流，不能写
             * 在try{}当中，这点需要注意*/
        } finally {
            try{
                in.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
