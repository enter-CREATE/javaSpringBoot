package cn.tedu.inter;

public class TestUserInter {
    public static void main(String[] args) {
        System.out.println(Inter4.age);
        Inter4Impl i4 = new Inter4Impl();
        System.out.println(i4.age);
    }
}
interface Inter4{
    //静态变量
    static final int age = 10;
    int a = 12;
    //抽象方法
    public abstract void eat();
    void play();
}
class Inter4Impl extends Object implements Inter4{
    //实现类的构造方法
    public Inter4Impl(){
        super();
        System.out.println("实现类的构造");
    }
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}