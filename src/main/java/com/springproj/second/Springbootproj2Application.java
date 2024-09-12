package com.springproj.second;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springproj.second.entity.Student;
import com.springproj.second.service.Studentsecondservice;
import com.springproj.second.service.Studentsecondserviceimp;

@SpringBootApplication

public class Springbootproj2Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Springbootproj2Application.class, args);
		
		Studentsecondservice simp= context.getBean(Studentsecondserviceimp.class);
		
		Student std1= new Student();
		std1.setName("Deepak");
		std1.setAddress("B block");
		std1.setState("Delhi");
		std1.setCity("New Delhi");
		
		Student std2= new Student();
		std2.setName("Neetu");
		std2.setAddress("B block");
		std2.setState("Delhi");
		std2.setCity("New Delhi");
		
		Student std3= new Student();
		std3.setName("Akshar");
		std3.setAddress("block");
		std3.setState("Delhi 110052");
		std3.setCity("New Delhi");
		
		//inserting one user
//		simp.insertUser(std3);
		
		//inserting more than one user
//		List<Student> stds= List.of(std1,std2);
//		Iterable<Student> getUser= simp.multipleInsert(stds);
		
//		fetching one user 
//		Student fetchedUser= simp.fetchUser(1);
//		System.out.println(fetchedUser);
		
		//Updating fetched User
//		fetchedUser.setAddress("L block");
//		simp.updateUser(fetchedUser);
//		simp.fetchUser(1);		
		//fetching multiple user
//		Iterable<Student> fetchedAllUser= simp.fetchAllUser();
//		fetchedAllUser.forEach(user-> {System.out.println(user);});
		
		//updating user
		
	}
}
