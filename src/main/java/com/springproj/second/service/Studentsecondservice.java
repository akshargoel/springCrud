package com.springproj.second.service;

import java.util.List;

import com.springproj.second.entity.Student;


public interface Studentsecondservice {
	public boolean insertUser(Student std);
	public Iterable<Student> multipleInsert(List<Student> stds);
	public boolean deleteUser(Student std);
	public boolean deleteAllUser(List<Student> std);
	public Student updateUser(Student std);
	public Iterable<Student> fetchAllUser();
	public Student fetchUser(int id);
	
}
