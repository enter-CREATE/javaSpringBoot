package cn.tedu.test;
import cn.tedu.ioc.User;
import cn.tedu.ioc.UserName;
import cn.tedu.spring.Hello;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {
    @Test
    public void get(){
        //读取配置文件
        ClassPathXmlApplicationContext spring =
                new ClassPathXmlApplicationContext("spring-config.xml");
        //直接getBean
        Object o = spring.getBean("hello");
        System.out.println(o);
        //向下转型
        Hello h = (Hello) o;
        h.get();


        Object o2 = spring.getBean("hi");
        System.out.println(o2);

        //component测试
        User u = (User) spring.getBean("user");
        System.out.println(u);

        UserName un =(UserName) spring.getBean("uName");
        System.out.println(un);
        un.eat();
    }
}
