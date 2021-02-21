package student.csulb.edu.model;

import javax.validation.constraints.AssertTrue;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	Student student;

	@Before
	public void before() {
		student = new Student();
	}

	@Test
	public void testgetSid() {
		student.setSid(3);
		assertTrue(student.getSid() == 3);
	}

	@Test
	public void setSid() {
		student.setSid(2);
		assertTrue(student.getSid() == 2);
	}

	@Test
	public void getFirstname() {
		student.setFirstname("Aastha");
		assertTrue(student.getFirstname().equals("Aastha"));
	}

	@Test
	public void setFirstname() {
		student.setFirstname("Aastha");
		assertTrue(student.getFirstname().equals("Aastha"));
	}
	
	@Test
	public void getLastname() {
		student.setLastname("Jain");
		assertTrue(student.getLastname().equals("Jain"));
	}

	@Test
	public void setLastname() {
		student.setLastname("Jain");
		assertTrue(student.getLastname().equals("Jain"));
	}

	@Test
	public void getAge() {
		student.setAge(3);
		assertTrue(student.getAge() == 3);
	}

	@Test
	public void setAge() {
		student.setAge(24);
		assertTrue(student.getAge() == 24);
	}

	@Test
	public void getGender() {
		student.setGender("Female");
		assertTrue(student.getGender().equals("Female"));
	}

	@Test
	public void setGender() {
		student.setGender("Male");
		assertTrue(student.getGender().equals("Male"));
	}

}
