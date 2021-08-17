package cn.tedu.service;

import cn.tedu.pojo.Car;
import org.springframework.stereotype.Component;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public Car get() {
        Car c = new Car();
        c.setName("保时捷").setColor("红色").setPrice(641000.0);
        return c;
    }
}
