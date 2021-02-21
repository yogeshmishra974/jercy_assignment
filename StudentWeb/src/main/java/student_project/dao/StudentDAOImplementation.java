package student_project.dao;


import java.sql.Connection;import java.util.ArrayList;
import java.util.List;

import student_project.model.Project;
import student_project.model.Student;
import student_project.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAOImplementation implements StudentDAO {


	private Connection conn;

	public StudentDAOImplementation() {
		//System.out.println("Student Dao constructor");
		conn = DBUtil.SetDBConnection();
	}

	@Override
	public void addStudent(Student student) {
		try {
			String query = "Insert into student(sno,sname,sdob,sdoj) values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, student.getSno());
			pstmt.setString(2, student.getSname());
			pstmt.setString(3, student.getSdob());
			pstmt.setString(4, student.getSdoj());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent(int studentid) {
		try {
			String query1="delete from student_project where sno=?";
			String query2 = "delete from student where sno=?";
			System.out.println("delete from student where sno=" + studentid);
			PreparedStatement pstmt1 = conn.prepareStatement(query1);
			PreparedStatement pstmt2 = conn.prepareStatement(query2);
			pstmt1.setInt(1, studentid);
			pstmt1.executeUpdate();
			pstmt1.close();
			
			pstmt2.setInt(1, studentid);
			pstmt2.executeUpdate();
			pstmt2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent(Student student) {
		try {
			String query = "update student set sname=? ,sdob=?,sdob=? where sno=?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, student.getSname());
			pstmt.setString(2, student.getSdob());
			pstmt.setString(3, student.getSdoj());
		
			pstmt.setInt(5, student.getSno());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				Student stu = new Student();
				stu.setSno(rs.getInt("sid"));
				stu.setSname(rs.getString("sname"));
				stu.setSdob(rs.getString("sdob"));
				stu.setSdoj(rs.getString("sdoj"));
				students.add(stu);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public Student getStudentById(int studentid) {
		Student stu = new Student();
		try {
			String query = "Select * from student where sno=?";
			System.out.println("Select * from student where sno=" + studentid);
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, studentid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				stu.setSno(rs.getInt("sno"));
				stu.setSname(rs.getString("sname"));
				stu.setSdob(rs.getString("sdob"));
			
				stu.setSdoj(rs.getString("sdoj"));

			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return stu;
	}


}
