package com.situ.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.situ.mybatis.pojo.Student;

public class MyBatisTest {
	@Test
	public void testMyBatis() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		Student student = sqlSession.selectOne("student.findById", 25);
		System.out.println(student);
	}
}
