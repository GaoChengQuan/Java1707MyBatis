package com.situ.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.situ.mybatis.pojo.Student;

public class MyBatisTest {
	
	@Test
	public void testFindByName() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		List<Student> list = sqlSession.selectList("student.findByName", "u");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testFindById() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		Student student = sqlSession.selectOne("student.findById", 27);
		System.out.println(student);
		sqlSession.close();
	}
	
	@Test
	public void testFindAll() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		List<Student> list = sqlSession.selectList("student.findAll");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testDeleteById() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		//autoCommit(false)
		int result = sqlSession.delete("student.deleteById", 26);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testDelete() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		//autoCommit(false)
		Student student = new Student();
		student.setId(25);
		int result = sqlSession.delete("student.delete", student);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testAdd() throws IOException {
		//加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		Student student = new Student();
		student.setName("李四222222");
		student.setAge(30);
		int result = sqlSession.delete("student.add", student);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
	}
}
