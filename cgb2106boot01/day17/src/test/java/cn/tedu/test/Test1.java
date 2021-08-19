package cn.tedu.test;

import cn.tedu.dao.DeptMapper;
import cn.tedu.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    @Test
    public void get() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //开启会话
        SqlSession session = factory.openSession();
        //定位sql，执行
        Object o = session.selectOne("userMapper.getById",1);
        System.out.println(o);
    }

    @Test
    public void get2() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory f = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = f.openSession();
        List<Object> o = session.selectList("userMapper.getAll");
        for (Object a:o
             ) {
            System.out.println(a);
        }
    }

    @Test
    public void get3() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //开启会话
        SqlSession session = factory.openSession();
        //定位sql，执行
        Object o = session.selectOne("userMapper.getByName", "hanmeimei");
        System.out.println(o);

        Dept dept = session.selectOne("deptMapper.getById");
        System.out.println(dept);
    }

    @Test
    public void get4() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //开启会话
        SqlSession session = factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept d = mapper.getById(1);
        System.out.println(d);

        List<Dept> d2 = mapper.getByName("java教研部");
        for (Dept a:d2
             ) {
            System.out.println(a);
        }

        Dept dept = new Dept(101,"roce","六区");
        //dept.setId(6).setDname("jack").setLoc("五区");
        mapper.save(dept);
        session.commit();

        mapper.deleteById(new int[]{1,2,3});
        session.commit();
    }
}
