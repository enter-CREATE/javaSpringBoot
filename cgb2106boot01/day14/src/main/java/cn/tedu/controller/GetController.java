package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class GetController {
    @RequestMapping("get")
    public String get(Integer id,String name){
        return "id="+id+"name="+name;
    }
    @RequestMapping("get2/{id}/{name}")
    public String get2(@PathVariable Integer id,@PathVariable String name){
        return id+name;
    }
    @RequestMapping("get3/{id}/{name}/{color}/{price}")
    public String get3(@PathVariable Integer id,
                       @PathVariable String name,
                       @PathVariable String color,
                       @PathVariable double price){
        return id+name+color+price;
    }
}
