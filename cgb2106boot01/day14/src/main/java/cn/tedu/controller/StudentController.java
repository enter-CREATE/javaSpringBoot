package cn.tedu.controller;

import cn.tedu.spring.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.Arrays;

@RestController
@RequestMapping("stu")
public class StudentController {
    @RequestMapping("add")
    public Object add(Student s) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql:///cgb2106?characterEncoding=utf8";
        Connection conn = DriverManager.getConnection(url, "root", "123456");
        String sql= "insert into tb_student values(null,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setObject(1,s.getName());
        ps.setObject(2,s.getAge());
        ps.setObject(3,s.getSex());
        ps.setObject(4, Arrays.toString(s.getHobby()));
        ps.setObject(5,s.getEdu());
        ps.setObject(6,s.getIntime());
        ps.executeUpdate();
        System.out.println("数据插入成功");
        return s;
    }
}
