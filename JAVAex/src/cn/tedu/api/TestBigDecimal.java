package cn.tedu.api;

import java.math.BigDecimal;
import java.util.Scanner;

/** 本类用于浮点数运算不精确解决方案*/
public class TestBigDecimal {
    public static void main(String[] args) {
        //f1();//进行普通的浮点四则运算
        f2();//使用BigDecimal解决浮点数运算不精确的问题
    }

    private static void f2() {
        System.out.println("请输入您要计算的第一个小数:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("请输入您要计算的第二个小数:");
        double b = new Scanner(System.in).nextDouble();

        /**1.最好不要用double作为构造函数的参数,
         * 不然还会有不精确的现象,有坑!!
         * 2.我们一般使用String类型作为构造函数的参数
         * 3.double转String,直接拼个空串就可以*/
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");

        BigDecimal bd3;
        bd3 = bd1.add(bd2);//+
        System.out.println(bd3);
        bd3 = bd1.subtract(bd2);//-
        System.out.println(bd3);
        bd3 = bd1.multiply(bd2);//*
        System.out.println(bd3);
        //divide(除谁,保留位数,舍入方式[四舍五入])
        bd3 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP); // /
        System.out.println(bd3);
    }

    private static void f1() {
        System.out.println("请输入您要计算的第一个小数:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("请输入您要计算的第二个小数:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
