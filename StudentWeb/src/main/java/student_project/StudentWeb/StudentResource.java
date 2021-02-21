package student_project.StudentWeb;

import java.net.URI;import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import student_project.dao.StudentDAO;
import student_project.dao.StudentDAOImplementation;
import student_project.model.Project;
import student_project.model.Student;



@Path("student")
public class StudentResource {

	StudentDAO studentdao = new StudentDAOImplementation();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "hello world";
	}

	@GET
	@Path("/allStudent")
	public Response getStudentInfo(@Context ServletContext context) {
		System.out.println("Inside ALL STUDENTS");
		List<Student> listStudent = studentdao.getAllStudents();
		context.setAttribute("liststudents", listStudent);

		UriBuilder ubu = UriBuilder.fromUri(context.getContextPath());
		ubu.path("listStudent.jsp");

		return Response.seeOther(ubu.build()).build();
	}

	@POST
	@Path("/insert")
	public Response redirectToAddStudent(@Context ServletContext context) {
		System.out.println("Inside insert1");
	
		UriBuilder ubu = UriBuilder.fromUri(context.getContextPath());
		ubu.path("addStudent.jsp");
		return Response.seeOther(ubu.build()).build();
	}
	
	@POST
	@Path("/insert/sid")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addStudent(@FormParam("sname") String sname,
			@FormParam("sdob") String dob, @FormParam("sdoj") String doj,
			@Context ServletContext context) throws Exception {

		System.out.println("Inside Update Student");
		Student student = new Student(sno, sname, sdob, sdoj);
		studentdao.addStudent(student);

		System.out.println("forwarding...");

		System.out.println(context.getContextPath());
		return getStudentInfo(context);
	}

	@POST
	@Path("/update/sid/{id}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response updateStudent(@PathParam("sno") int sno, @FormParam("sname") String sname,
		@FormParam("sdob") String dob, @FormParam("sdoj") String doj,
			@Context ServletContext context) throws Exception {

		System.out.println("Inside Update Student");
		Student student = new Student(sno, sname, sdob, sdoj, sdob);
		studentdao.updateStudent(student);

		System.out.println("forwarding...");

		System.out.println(context.getContextPath());
		return getStudentInfo(context);
	}

	@POST
	@Path("/update/{id}")
	public Response redirectToUpdateStudent(@PathParam("id") int id, @Context ServletContext context) {
		Student student = new Student();
		student = studentdao.getStudentById(id);
		System.out.println("----Update--- " + student.toString());
		context.setAttribute("student", student);

		UriBuilder ubu = UriBuilder.fromUri(context.getContextPath());
		ubu.path("/student.jsp");
		return Response.seeOther(ubu.build()).build();
	}

	@POST
	@Path("/delete/sid/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response deleteEmployee(@Context ServletContext context, @PathParam("id") int id) {
		System.out.println("Inside delete function");
		studentdao.deleteStudent(id);
		System.out.println("Successfuly deleted User with id=" + id);
		return getStudentInfo(context);
	}

	@POST
	@Path("/courses/sid/{id}")
	public Response getCoursesByStudentId(@PathParam("id") int id, @Context ServletContext context) {
		List<Project> course = new ArrayList<Project>();
		course = studentdao.getCoursesById(id);
		System.out.println("----Course List --- " + course.toString());
		context.setAttribute("course", course);

		UriBuilder ubu = UriBuilder.fromUri(context.getContextPath());
		ubu.path("project.jsp");
		return Response.seeOther(ubu.build()).build();
	}
	
}
