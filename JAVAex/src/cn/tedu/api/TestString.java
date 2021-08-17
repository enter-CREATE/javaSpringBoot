package cn.tedu.api;
/** 本类用于测试String*/
public class TestString {
    public static void main(String[] args) {
        //创建方式一
        /** 字符串底层维护的是char[]，存放在堆中*/
        char[] value = {'a','b','c'};
        String s1 = new String(value);//除法含参构造创建String类对象
        String s11 = new String(value);//除法含参构造创建String类对象
        //创建方式二
        /** 创建底层也会new String()，存放在堆中常量池中，效率高*/
        String s2 = "abc";
        String s22 = "abc";
        String s3 = "aaa";
        //测试
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s11);//false,没有高效效果
        System.out.println(s2 == s22);//true，有高效效果
        System.out.println(s2 == s3);//false，有高效效果，但值不一样
        /** ==比较的是两个对象的地址值
         * Object类中的equals()默认实现比较的也是==地址比较
         * 但String类重写了方法，不再比较地址值，而是两个串的具体内容
         * 也就是说，不论创建方式，只要串的内容一致，equals()就返回true*/
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s11));//true
        System.out.println(s2.equals(s3));//值不一样，返回false

    }
}
