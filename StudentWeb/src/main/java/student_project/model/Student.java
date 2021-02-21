package student_project.model;


public class Student {

	int sno;
	String sname;
	String sdob;
	String sdoj;

	public Student() {
		super();
	}

	
	public Student(int sno, String sname, String sdob, String sdoj) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sdob = sdob;
		this.sdoj = sdoj;
	}


	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdob() {
		return sdob;
	}

	public void setSdob(String sdob) {
		this.sdob = sdob;
	}

	public String getSdoj() {
		return sdoj;
	}

	public void setSdoj(String sdoj) {
		this.sdoj = sdoj;
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sdob=" + sdob + ", sdoj=" + sdoj + "]";
	}
	
	

	

}
