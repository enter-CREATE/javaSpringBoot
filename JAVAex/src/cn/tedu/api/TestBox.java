package cn.tedu.api;
/** 本类用于测试自动装箱与自动拆箱*/
public class TestBox {
    public static void main(String[] args) {
        //创建包装类
        Integer i1 = new Integer(127);
        Integer i2 = Integer.valueOf(127);

        //自动装箱
        /**1.自动装箱:编译器会自动把基本类型int127包装成包装类型Integer
         * 然后交给Integer类型的引用类型变量i3来保存
         * 自动装箱底层发生的代码:Integer.valueOf(127);
         * valueOf()的方向int(基本类型)-->Integer(包装类型)*/
        Integer i3 = 127;

        //int i = i1.intValue();
        /**2.自动拆箱:编译器会自动把包装类型i1的"箱子"拆掉
         * 变回基本类型数据int127,然后交给基本类型i4来保存
         * 底层发生的代码:i1.intValue();
         * intValue()的方向:Integer(包装类型)-->int(基本类型)*/
        int i4 = i1;
    }
}
