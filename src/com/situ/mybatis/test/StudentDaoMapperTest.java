package com.situ.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.situ.mybatis.mapper.StudentMapper;
import com.situ.mybatis.pojo.Student;
import com.situ.mybatis.vo.SearchVO;

public class StudentDaoMapperTest {
	private SqlSessionFactory factory;
	
	@Before
	public void before() {
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
	
	@Test
	public void testFindByAll() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		List<Student> list = studentDao.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindBySearchVO1() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		SearchVO searchVO = new SearchVO();
		Student student = new Student();
		student.setName("uu");
		searchVO.setStudent(student);
		List<Student> list = studentDao.findBySearchVO(searchVO);
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testFindByPage() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("index", 3);
		map.put("pageSize", 3);
		List<Student> list = studentDao.findByPage(map);
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testFindByPage1() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		List<Student> list = studentDao.findByPage1(3, 3);
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testFindCount() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		int count = studentDao.findCount();
		System.out.println(count);
	}
	
	@Test
	public void testFindByCondition() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setName("uu");
		student.setAge(20);
		List<Student> list = studentDao.findByCondition(student);
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testDynaUpdate() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setId(27);
		student.setName("xxx");
		student.setAge(28);
		studentDao.dynaUpdate(student);
		session.commit();
	}
	
	@Test
	public void testFindByIdArray() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		int[] array = {27,38,39,999};
		List<Student> list = studentDao.findByIdArray(array);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindByIdList() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		List<Integer> list = new ArrayList<Integer>();
		list.add(27);
		list.add(38);
		list.add(39);
		list.add(999);
		List<Student> listResult = studentDao.findByIdList(list);
		for (Student student : listResult) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindBySearchVO() {
		//IStudentDao studentDao = new StudentDaoImpl();
		SqlSession session = factory.openSession();
		StudentMapper studentDao = session.getMapper(StudentMapper.class);
		SearchVO searchVO = new SearchVO();
		List<Integer> list = new ArrayList<Integer>();
		list.add(27);
		list.add(38);
		list.add(39);
		list.add(999);
		searchVO.setIdIist(list);
		List<Student> listResult = studentDao.findBySearchVO(searchVO);
		for (Student student : listResult) {
			System.out.println(student);
		}
	}
	
	
}
