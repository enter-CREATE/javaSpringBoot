package cn.tedu.controller;

import cn.tedu.pojo.Car;
import cn.tedu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarService carService;
    @RequestMapping("get")
    public List<Car> selectList(){
        return carService.selectList();
    }
}
