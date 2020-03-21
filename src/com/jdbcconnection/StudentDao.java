package com.jdbcconnection;

import java.util.List;

public interface StudentDao {

	List<Student> getAllStudents() throws Exception;
	boolean saveStudent(Student student);
	boolean deleStudent(int id);







}
