package cn.tedu;

import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class GetController {
    @RequestMapping("param4")
    public Car param4(Car c){
        return c;
    }
    @RequestMapping("param3")
    public String param3(int id,String name,double price){
        return "id="+id+"name="+name+"price="+price;
    }
    @RequestMapping("param2")
    public void param2(int a,String b){
        System.out.println(a);
        System.out.println(b);
    }
    @RequestMapping("param")
    public String param(int id,String name,String age){
        return "你的请求参数里id="+id+
               "你的请求参数里name="+name+
               "你的请求参数里age="+age;
    }
    @Test
    public void get1(){
        String url = "http://localhost:8080/car/insert?id=1&name=张三&age=18";
        String[] s = url.split("\\?")[1].split("&");
        for (String a:s
             ) {
            String data = a.split("=")[1];
            System.out.println(data);
        }
    }
}
