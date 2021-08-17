package cn.tedu.dao;

import cn.tedu.pojo.Dept;

import java.util.List;

public interface DeptMapper {
    Dept getById(Integer id);
    List<Dept> getByName(String dname);
    void save(Dept dept);
}
