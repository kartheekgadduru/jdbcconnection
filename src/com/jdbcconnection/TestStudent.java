package com.jdbcconnection;

public class TestStudent {

	public static void main(String[] args) throws Exception {

		/*Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/smart-brain", "postgres", "");
		Statement stm = con.createStatement();
		//PreparedStatement ps = con.prepareStatement("insert into users values (?,?,?,?)");
		PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?,?)");
		//ResultSet rs = stm.executeQuery("select *from student");

		Student student = new Student();
		while(rs.next()) {
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			st
		}
		student.setId(3);
		student.setName("Arun");
		student.setEmail("arunmk@gmail.com");
		student.setAge(15);


		System.out.println(student.getAge());


		ps.setInt(1, student.getId());
		ps.setString(2, student.getName());
		ps.setString(3,student.getEmail());
		ps.setInt(4, student.getAge());


		//	int rs = stm.executeUpdate("insert into student values (,'sanjay','sanjay@gmail.com',25)");

		int rs = ps.executeUpdate();


		//int rs = stm.executeUpdate("delete from student where id =3");

		System.out.println(rs);

		con.close();*/


		StudentDaoImpl studeImpl = new StudentDaoImpl();

		for(Student student:studeImpl.getAllStudents()) {
			System.out.println(student.getAge());
		}



	}

}
