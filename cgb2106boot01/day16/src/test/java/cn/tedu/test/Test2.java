package cn.tedu.test;

import cn.tedu.pojo.Student;
import org.junit.jupiter.api.Test;

public class Test2 {
    @Test
    public void get2(){
        Student s = new Student();
        s.setId(18).setName("jack").setSex("男");
        System.out.println(s.toString());
    }
}
