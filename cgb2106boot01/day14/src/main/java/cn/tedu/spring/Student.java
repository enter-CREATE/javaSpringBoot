package cn.tedu.spring;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;

public class Student {
    private String name;
    private Integer age;
    private Integer sex;
    private String[] hobby;
    private Integer edu;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date intime;

    public Student() {
    }

    public Student(String name, Integer age, Integer sex, String[] hobby, Integer edu, Date intime) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
        this.edu = edu;
        this.intime = intime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Integer getEdu() {
        return edu;
    }

    public void setEdu(Integer edu) {
        this.edu = edu;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hobby=" + Arrays.toString(hobby) +
                ", edu=" + edu +
                ", intime=" + intime +
                '}';
    }
}
