package cn.tedu.cgb2106boot01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {
    @RequestMapping("abc")
    public String hello(){
        return "hello spring boot";
    }
}
