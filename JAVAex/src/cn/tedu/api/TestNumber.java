package cn.tedu.api;
/** 本类用于测试包装类*/
public class TestNumber {
    //定义成员变量，类里方法外，静态只能调用静态
    static Integer i0;//成员变量可以不手动初始化
    public static void main(String[] args) {
        System.out.println(i0);//默认为null
        //创建Integer对象的方式一
        Integer i1 = new Integer(5);
        Integer i11 = new Integer(5);
        System.out.println(i1 == i11);//false,比较的是地址值
        //创建Integer对象的方式二
        Integer i2 = Integer.valueOf(127);
        Integer i3 = Integer.valueOf(127);
        System.out.println(i1 == i2);//false
        System.out.println(i2 == i3);//true,高效

        Integer i4 = Integer.valueOf(300);
        Integer i5 = Integer.valueOf(300);
        System.out.println(i4 == i5);//false，数据超出高效的范围

        //创建double类型对应包装类型Double的方式
        Double d1 = new Double(3.14);

        Double d2 = Double.valueOf(3.14);
        Double d3 = Double.valueOf(3.14);
        System.out.println(d1 == d2);//false
        System.out.println(d2 == d3);//false,只有Integer的valueOf()才有高效效果，其他类型没有
        //测试
        //调用parseInt(),将String转为int
        System.out.println(i1.parseInt("600")+10);//610
        //调用parseDouble()，将String转为double
        System.out.println(d1.parseDouble("3.14")+1);
    }
}
