package cn.tedu.api;

import java.util.Arrays;

/** 本类用于练习String类的常用方法*/
public class TestString2 {
    public static void main(String[] args) {
        //创建字符串
        String s = "abc";

        char[] value = {'a','b','c','d'};
        String ss = new String(value);
        //测试常用方法
        System.out.println(s.charAt(1));//b,获取指定下标的字符

        String s2 = s.concat("cxy");//用于拼接指定的字符串，但注意不会改变原串
        System.out.println(s);//abc，不会改变原串
        System.out.println(s2);//abccxy，打印的是拼接后s2指向的串abccxy

        System.out.println(s.concat("cxy"));
        System.out.println(s.endsWith("y"));//false,判断是否以指定元素结尾
        System.out.println(s.startsWith("a"));//true，判断是否以指定元素开始

        String s3 = "a b c d e";
        //根据指定规则分割字符串，注意返回值类型是String[]，需要使用数组工具打印
        System.out.println(s3.split(" "));//[Ljava.lang.String;@5fd0d5ae
        System.out.println(Arrays.toString(s3.split(" ")));

        //根据下标截取子串，如果只有一个下标，那就从指定位置处开始截取，包含指定下标
        //如果有两个下标，就截取这两个下标之间的子串，注意含头不含尾
        System.out.println(s3.substring(3));// c d e，[3,结束]
        System.out.println(s3.substring(1,5));// b c，[1,5)

        System.out.println(s3.toUpperCase());//把指定字符串转为全大写
        System.out.println(s3.toLowerCase());//把指定字符串转为全小写

        s3 = "   abcde    ";
        System.out.println(s3.trim());//去除指定字符串首尾空格

        System.out.println(String.valueOf(10));//10,转为String类型的"10"
        System.out.println("20"+10);//2010
        System.out.println(String.valueOf(80)+10);//8010
        System.out.println(10+10);//20
    }
}
