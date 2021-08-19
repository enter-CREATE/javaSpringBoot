package cn.tedu.service;

import cn.tedu.dao.CarMapper;
import cn.tedu.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper mapper;
    @Override
    public List<Car> selectList() {
        return mapper.selectList();
    }
}
