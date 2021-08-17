package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/** 本类用于测试文件类的常用方法*/
public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ready\\1.txt");
        //常用方法
        System.out.println(file.length());//字节量
        System.out.println(file.exists());//是否存在
        System.out.println(file.isFile());//是否是文件
        System.out.println(file.isDirectory());//是否是文件夹
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取父级路径
        System.out.println(file.getAbsoluteFile());//获取文件绝对路径

        file = new File("D:\\ready\\2.txt");//创建java对象
        System.out.println(file.createNewFile());//真正的创建一个2.txt

        file = new File("D:\\ready\\a");
        System.out.println(file.mkdir());//创建单层文件夹
        file = new File("D：\\ready\\a\\b\\c");
        System.out.println(file.mkdirs());//创建多层文件夹

        //测试删除
        System.out.println(file.delete());//只有c被删除
        file = new File("D:\\ready\\a");
        System.out.println(file.delete());//false,文件夹不空
        file = new File("D:\\ready\\2.txt");
        System.out.println(file.delete());//2.txt被删除

        //文件列表测试
        file = new File("D:\\ready");
        String[] listName = file.list();
        System.out.println(Arrays.toString(listName));
        /**常用listFiles()因为返回值类型是File[]
         * 可以拿到一个个的File对象做进一步操作*/
        File[] fs = file.listFiles();
        System.out.println(Arrays.toString(fs));
        System.out.println(fs[0].length());
    }
}
