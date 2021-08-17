package cn.tedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stu")
public class StuController {
    @RequestMapping("get")
    public String get(){
        return "123";
    }
}
