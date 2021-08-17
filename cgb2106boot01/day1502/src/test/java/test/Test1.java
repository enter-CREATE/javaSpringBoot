package test;

import cn.tedu.di.Dept;
import cn.tedu.di.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void get2(){
        ClassPathXmlApplicationContext spring =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Object s = spring.getBean("student");
        System.out.println(s);
    }
    @Test
    public void get(){
        Dept d = new Dept();
        System.out.println(d);
        Emp e = new Emp();
        System.out.println(e);
        e.setD(d);
        Dept d1 = e.getD();
        System.out.println(d1);
        System.out.println(e);
    }
}
