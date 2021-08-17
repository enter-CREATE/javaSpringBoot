package cn.tedu.io;

/**本类用于封装学生类*/

import java.io.Serializable;

/**如果本类想要完成序列化，必须实现可序列化接口，否则会报错
 * 报错信息：
 * NotSerializableException: cn.tedu.serializable.Student
 * Serializable接口是一个空接口，里面一个方法都没有
 * 作用是用来当作标记，标记这个类的对象可以被序列化输出*/
public class Student implements Serializable {
    //private static final long serialVersionUID = 1L;
    //1.1定义学生的相关属性并封装
    private String name;//姓名
    private int age;//年龄
    private String addr;//住址
    private char gender;//性别
    //private char gender;//性别

    //2.1生成对应的无参构造
    public Student() {
        System.out.println("我是Student类的无参构造");
    }
    //2.2生成对应的全参构造
    public Student(String name, int age, String addr, char gender) {
        System.out.println("我是Student类的全参构造");
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gender = gender;
    }

    //1.2提供对应的所有方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //在Student类中添加重写的toString(),不然打印的是地址值
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gender=" + gender +
                '}';
    }
}
