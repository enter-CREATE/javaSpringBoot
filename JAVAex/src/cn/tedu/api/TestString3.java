package cn.tedu.api;
/** 本类用于练习字符串的拼接*/
public class TestString3 {
    public static void main(String[] args) {
        //method();//普通字符串的拼接
        method2();//高效字符串的拼接
    }

    private static void method2() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        //优化
        StringBuilder sb = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();
        //在循环前获取系统当前时间作为开始时间
        long t1 = System.currentTimeMillis();
        for (int i = 1; i < 10001; i++){
            //优化
            //sb.append(str);
            sb2.append(str);
        }
        //在循环结束后获取系统当前时间作为结束时间
        long t2 = System.currentTimeMillis();
        System.out.println("拼接结果是："+sb2);
        System.out.println("花费的时间是："+(t2-t1));
    }

    private static void method() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String result = "";//保存结果
        //在循环前获取系统当前时间作为开始时间
        long t1 = System.currentTimeMillis();
        for (int i = 1; i < 10001; i++){
            result = result + str;
        }
        //在循环结束后获取系统当前时间作为结束时间
        long t2 = System.currentTimeMillis();
        System.out.println("拼接结果是："+result);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("花费的时间是："+(t2-t1));
    }
}
