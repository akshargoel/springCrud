package com.springproj.second.repo;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproj.second.entity.Student;

//added integer to id as that is in int and it takes wrapper class
@Repository
public interface StudentReposec extends CrudRepository<Student, Integer>  {
}