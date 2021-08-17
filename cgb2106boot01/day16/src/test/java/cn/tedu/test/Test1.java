package cn.tedu.test;

import cn.tedu.pojo.Car;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void get(){
        Car c = new Car();
        c.setId(15);
        c.setName("BMW");
        c.setColor("blue");
        c.setPrice(9.9);
        System.out.println(c.toString());
    }
}
