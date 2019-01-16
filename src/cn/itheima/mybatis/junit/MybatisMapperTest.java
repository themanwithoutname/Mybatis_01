package cn.itheima.mybatis.junit;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itheima.mybatis.mapper.UserMapper;
import cn.itheima.mybatis.pojo.User;

public class MybatisMapperTest {
	@Test
	public void testMapper() throws Exception{
		// 加载SqlMapConfig.xml配置文件
		String resource = "SqlMapConfig.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		// 创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//SqlSession帮助我们生成一个实现类（要给接口）
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.findUserById(10);
		System.out.println(user);
		
	}
}
