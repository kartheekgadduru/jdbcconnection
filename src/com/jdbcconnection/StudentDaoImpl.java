package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> getAllStudents() throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/smart-brain", "postgres", "");
		Statement stm = con.createStatement();
		ResultSet rs =stm.executeQuery("select *from student");
		Student student = new Student();
		List<Student> list = new ArrayList<Student>();// This one of the applicaiton of your collections api
		while(rs.next()) {
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setEmail(rs.getString(3));
			student.setAge(rs.getInt(4));
			list.add(student);
		}
		return list;
	}

	@Override
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}




}
