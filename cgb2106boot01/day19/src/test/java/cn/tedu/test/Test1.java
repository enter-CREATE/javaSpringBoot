package cn.tedu.test;

import cn.tedu.dao.userInfoMapper;
import cn.tedu.pojo.UserInfo;
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
    public void all() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession(true);
        userInfoMapper mapper = session.getMapper(userInfoMapper.class);
        List<UserInfo> userInfos = mapper.selectList();
        for (UserInfo a:userInfos
             ) {
            System.out.println(a);
        }
    }
}
