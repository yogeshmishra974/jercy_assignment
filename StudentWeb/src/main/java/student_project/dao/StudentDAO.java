package student_project.dao;


import java.util.List;

import student_project.model.Project;
import student_project.model.Student;

public interface StudentDAO {

	public void addStudent(Student student);
	public void deleteStudent(int studentid);
	public void updateStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int studentid);
	
	public List<Project> getCoursesById(int studentid);
}
