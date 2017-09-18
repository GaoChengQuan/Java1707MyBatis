package com.situ.mybatis.pojo;

import java.util.List;

public class Banji {
	private Integer id;
	private String name;
	private List<Student> list;
	private List<Course> courseList;

	public Banji() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banji(String name) {
		super();
		this.name = name;
	}

	public Banji(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Banji(Integer id, String name, List<Student> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}

	public Banji(Integer id, String name, List<Student> list, List<Course> courseList) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.courseList = courseList;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "Banji [id=" + id + ", name=" + name + ", list=" + list + ", courseList=" + courseList + "]";
	}

}
