package com.situ.mybatis.vo;

import java.util.List;

import com.situ.mybatis.pojo.Student;

public class SearchVO {
	private Student student;
	private List<Integer> idIist;

	public SearchVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public List<Integer> getIdIist() {
		return idIist;
	}

	public void setIdIist(List<Integer> idIist) {
		this.idIist = idIist;
	}

	@Override
	public String toString() {
		return "SearchVO [student=" + student + ", list=" + idIist + "]";
	}

}
