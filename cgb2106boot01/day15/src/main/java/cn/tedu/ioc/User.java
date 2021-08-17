package cn.tedu.ioc;

import org.springframework.stereotype.Component;

@Component//spring提供的，用来ioc
public class User {
    public void get(){
        System.out.println("123");
    }
}
