package cn.tedu.di2;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    String name = "rose";

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
