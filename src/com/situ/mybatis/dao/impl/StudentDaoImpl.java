package com.situ.mybatis.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.situ.mybatis.mapper.StudentMapper;
import com.situ.mybatis.pojo.Student;

public class StudentDaoImpl implements StudentMapper{
	private SqlSessionFactory factory;
	
	public StudentDaoImpl() {
		// 加载核心配置文件
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建SqlSessionFactory
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Override
	public List<Student> findAll() {
		//创建SqlSession
		SqlSession sqlSession = factory.openSession();
		//执行sql语句
		List<Student> list = sqlSession.selectList("student.findAll");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
		return list;
	
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
