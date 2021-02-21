package student.csulb.edu.model;

import static org.junit.Assert.*;

import javax.validation.constraints.AssertTrue;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	Project course;

	@Before
	public void before() {
		course = new Project();
	}

	@Test
	public void testgetCid() {
		course.setCid(2);
		assertTrue(course.getCid() == 2);
	}

	@Test
	public void testsetCid() {
		course.setCid(2);
		assertTrue(course.getCid() == 2);
	}

	@Test
	public void testgetcNumber() {
		course.setcNumber("CS142");
		assertTrue(course.getcNumber().equals("CS142"));
	}

	@Test
	public void testsetcNumber() {
		course.setcNumber("CS142");
		assertTrue(course.getcNumber().equals("CS142"));
	}

	@Test
	public void testgetcName() {
		course.setcName("Web Stuff");
		assertTrue(course.getcName().equals("Web Stuff"));
	}

	@Test
	public void testsetcName() {
		course.setcName("Web Stuff");
		assertTrue(course.getcName().equals("Web Stuff"));
	}

	@Test
	public void testgetQuarter() {
		course.setQuarter("Fall 2017");
		assertTrue(course.getQuarter().equals("Fall 2017"));
	}

	@Test
	public void testsetQuarter() {
		course.setQuarter("Fall 2017");
		assertTrue(course.getQuarter().equals("Fall 2017"));
	}

}
