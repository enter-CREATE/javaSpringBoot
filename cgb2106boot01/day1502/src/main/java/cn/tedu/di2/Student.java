package cn.tedu.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired//di
    Teacher t;

    String name = "铁头哥";

    @Override
    public String toString() {
        return "Student{" +
                "t=" + t +
                ", name='" + name + '\'' +
                '}';
    }
}
