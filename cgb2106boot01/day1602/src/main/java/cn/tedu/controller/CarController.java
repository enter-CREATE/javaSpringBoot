package cn.tedu.controller;

import cn.tedu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
@CrossOrigin//放行js请求--跨域的解决方案
public class CarController {
    @Autowired
    private CarService carService;
    @RequestMapping("get")
    public Object get(){
        return carService.get();
    }
}
