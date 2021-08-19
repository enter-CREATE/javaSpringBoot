package cn.tedu.dao;

import cn.tedu.pojo.Car;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CarMapper {
    List<Car> selectList();
}
