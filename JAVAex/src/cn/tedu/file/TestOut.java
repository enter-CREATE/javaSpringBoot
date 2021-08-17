package cn.tedu.file;

import java.io.*;//通配符
/** 本类用于练习字节输出流*/
public class TestOut {
    public static void main(String[] args) {
        //method();//普通字节输出流
        method2();//高效字节输出流
    }

    private static void method2() {
        OutputStream out = null;
        try{
            out = new BufferedOutputStream(
                    new FileOutputStream("D:\\ready\\1.txt",true)
            );
            out.write(100);//对应d
            out.write(100);//对应d
            out.write(100);//对应d
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                out.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        OutputStream out = null;
        try{
            out = new FileOutputStream("D:\\ready\\1.txt",true);
            out.write(100);//对应d
            out.write(100);//对应d
            out.write(100);//对应d
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                out.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
