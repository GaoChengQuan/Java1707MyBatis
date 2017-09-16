package com.situ.mybatis.test;

import java.util.List;

import org.junit.Test;

import com.situ.mybatis.dao.impl.StudentDaoImpl;
import com.situ.mybatis.mapper.StudentMapper;
import com.situ.mybatis.pojo.Student;

public class StudentDaoTest {
	@Test
	public void testFindAll() {
		StudentMapper studentDao = new StudentDaoImpl();
		List<Student> list = studentDao.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
