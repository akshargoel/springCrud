package com.springproj.second.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.second.entity.Student;
import com.springproj.second.repo.StudentReposec;

@Service
public class Studentsecondserviceimp implements Studentsecondservice {

	@Autowired
	private StudentReposec strp;
	
	//insert single
	public boolean insertUser(Student std) {
		try {
			strp.save(std);
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		}
		
	//insert multiple
	public Iterable<Student> multipleInsert(List<Student> stds){
		
		try {
			Iterable<Student> std= strp.saveAll(stds);
			return std;
		}
		catch(Exception e) {
			
			System.err.println("Error occurred while inserting students: " + e.getMessage());
	        e.printStackTrace();
	        // You can also rethrow the exception or return an empty list if preferred
	        throw e;  
		}
	}
	
	//update user
	public Student updateUser(Student std) {
		try {
			Student savedUser= strp.save(std);
			return savedUser;
		}
		catch(Exception e) {
			
			System.err.println("Error occurred while inserting students: " + e.getMessage());
	        e.printStackTrace();
	        throw e; 
		}
	}
	
	//delete user
	public boolean deleteUser(Student std) {
		try {
			strp.delete(std);
			return true;
		}
		catch(Exception e) {
			
			System.err.println("Error occurred while inserting students: " + e.getMessage());
	        e.printStackTrace();
	        throw e; 
		}
	}
	
	public boolean deleteAllUser(List<Student> std) {
		try {
			strp.deleteAll(std);
			return true;
		}
		catch(Exception e) {
			
			System.err.println("Error occurred while inserting students: " + e.getMessage());
	        e.printStackTrace();
	        throw e; 
		}
	}
	
	//fetch single
	public Student fetchUser(int id){
		try {
			Optional<Student> std= strp.findById(id);
			Student std1= std.get();
			return std1;
		}
		catch(Exception e) {
			
			System.err.println("Error occurred while inserting students: " + e.getMessage());
	        e.printStackTrace();
	        throw e; 
		}
	}
	
	//fetch multiple
	public Iterable<Student> fetchAllUser(){
		try {
			Iterable<Student> std= strp.findAll();
			return std;
		}
		catch(Exception e) {
			
			System.err.println("Error occurred while inserting students: " + e.getMessage());
	        e.printStackTrace();
	        throw e; 
		}
	}
	
}

