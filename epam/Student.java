package com.test.groupby.epam;

import java.util.List;

public class Student {
	
	public Student() {
		
	}
	
	public Student(String name, List<Pair<String, Integer>> marksheet) {
		super();
		this.name = name;
		this.marksheet = marksheet;
	}

	private String name;
	
	private List<Pair<String, Integer>> marksheet;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Pair<String, Integer>> getMarksheet() {
		return marksheet;
	}
	public void setMarksheet(List<Pair<String, Integer>> marksheet) {
		this.marksheet = marksheet;
	} 
	
}
