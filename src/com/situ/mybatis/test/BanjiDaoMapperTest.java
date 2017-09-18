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

import com.situ.mybatis.mapper.BanjiMapper;
import com.situ.mybatis.mapper.StudentMapper;
import com.situ.mybatis.pojo.Banji;
import com.situ.mybatis.pojo.Course;
import com.situ.mybatis.pojo.Student;
import com.situ.mybatis.vo.SearchVO;

import net.sf.cglib.core.CollectionUtils;

public class BanjiDaoMapperTest {
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
		BanjiMapper banjiMapper = session.getMapper(BanjiMapper.class);
		Banji banji = banjiMapper.findBanjiCourseInfoById(1);
		System.out.println(banji);
		List<Course> courseList = banji.getCourseList();
		for (Course course : courseList) {
			System.out.println(course);
		}
		
	}
	
	
	
}
