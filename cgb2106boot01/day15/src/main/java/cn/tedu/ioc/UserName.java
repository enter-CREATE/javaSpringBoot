package cn.tedu.ioc;

import org.springframework.stereotype.Component;

@Component("uName")
public class UserName {
    public void eat(){
        System.out.println("快乐的吃饭！");
    }
}
