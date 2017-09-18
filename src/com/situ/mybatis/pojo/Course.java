package com.situ.mybatis.pojo;

import java.util.List;

public class Course {
	private Integer id;
	private String name;
	private Integer credit;
	private List<Banji> banjiList;

	public Course(String name, Integer credit, List<Banji> banjiList) {
		super();
		this.name = name;
		this.credit = credit;
		this.banjiList = banjiList;
	}

	public Course(Integer id, String name, Integer credit, List<Banji> banjiList) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.banjiList = banjiList;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
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

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public List<Banji> getBanjiList() {
		return banjiList;
	}

	public void setBanjiList(List<Banji> banjiList) {
		this.banjiList = banjiList;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit + ", banjiList=" + banjiList + "]";
	}

}
