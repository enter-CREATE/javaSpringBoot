package cn.tedu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class HelloController {
    @RequestMapping("get2")
    public String get2(){
        Car car = new Car(718,"保时捷","Cayman T","红色",12000);
        return car.toString();
    }
    @RequestMapping("get")
    public String show(){
        return "123";
    }
    @RequestMapping("abc")
    public int show2(){
        return 100;
    }
    @RequestMapping("bsj")
    public String show3(){
        Car car = new Car();
        car.setId(718);
        car.setName("保时捷");
        car.setType("Cayman T");
        car.setColor("红色");
        car.setPrice(12000);
        return car.toString();
    }
    @RequestMapping("arr")
    public int[] arr(){
        int[] a = {1,2,3};
        return a;
    }
}
