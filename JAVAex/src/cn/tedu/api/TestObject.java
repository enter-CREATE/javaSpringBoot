package cn.tedu.api;

import java.util.Objects;

/** 本类用于测试顶级父类Object*/
public class TestObject {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student("李逵",3);
        Student ss = new Student("李逵",3);
        Student s2 = new Student();
        //重写toString前打印的是地址值，重写后打印的是属性
        System.out.println(s);  //Java1.Student@2d98a335
        System.out.println(s2);  //Java1.Student@16b98e56
        System.out.println(s.hashCode());
        System.out.println(ss.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s.equals(ss));
    }
}
class Student{
    //定义属性
    String name;
    int age;
    //无参构造
    public Student() {
    }
    //全参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}