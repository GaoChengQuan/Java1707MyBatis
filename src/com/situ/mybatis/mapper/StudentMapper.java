package com.situ.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.junit.validator.PublicClassValidator;

import com.situ.mybatis.pojo.Student;
import com.situ.mybatis.vo.SearchVO;

public interface StudentMapper {
	public abstract Student findById(int id);
	public abstract List<Student> findAll();
	public abstract void deleteById(int id);
	public abstract List<Student> findBySearchVO1(SearchVO searchVO);
	public abstract List<Student> findByPage(Map<String, Integer> map);
	public abstract List<Student> findByPage1(@Param(value="index")int index, @Param(value="pageSize")int pageSize);
	public abstract int findCount();
	public abstract List<Student> findByCondition(Student student);
	public abstract void dynaUpdate(Student student);
	
	
	public abstract List<Student> findByIdArray(int[] array11);
	public abstract List<Student> findByIdList(List<Integer> list);
	public abstract List<Student> findBySearchVO(SearchVO searchVO);
	
}
