package cn.tedu.io;

import java.io.*;

/** 复习IO操作*/
public class ReviewIO {
    public static void main(String[] args) throws Exception {
        //普通字节输入流
        InputStream in = new FileInputStream(new File(""));
        InputStream in2 = new FileInputStream("");
        //高效字节输入流
        InputStream in3 = new BufferedInputStream(new FileInputStream(new File("")));
        InputStream in4 = new BufferedInputStream(new FileInputStream(""));
        //普通字符输入流
        Reader in5 = new FileReader(new File(""));
        Reader in6 = new FileReader("");
        //高效字符输入流
        Reader in7 = new BufferedReader(new FileReader(new File("")));
        Reader in8 = new BufferedReader(new FileReader(""));
        //普通字节输出流
        OutputStream out1 = new FileOutputStream(new File(""));
        OutputStream out2 = new FileOutputStream("");
        //高效字节输出流
        OutputStream out3 = new BufferedOutputStream(new FileOutputStream(new File("")));
        OutputStream out4 = new BufferedOutputStream(new FileOutputStream(""));
        //普通字符输出流
        Writer out5 = new FileWriter(new File(""));
        Writer out6 = new FileWriter("");
        //高效字符输出流
        Writer out7 = new BufferedWriter(new FileWriter(new File("")));
        Writer out8 = new BufferedWriter(new FileWriter(""));
        //读取操作
        int b;
        while ((b = in.read())!= -1){
            System.out.println(b);
        }
        //写出操作
        out1.write(97);
        out1.flush();
        //关流需要写在finally{}中，而且需要继续try-catch
    }
}
