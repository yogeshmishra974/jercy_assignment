package student_project.model;


public class Project {

	int pid ;
	String pname;
	String pduration;
	String pplatfrom;
	
	public Project() {
		super();
	}
	
	
	

	public Project(int pid, String pname, String pduration, String pplatfrom) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pduration = pduration;
		this.pplatfrom = pplatfrom;
	}

	



	public int getPid() {
		return pid;
	}




	public void setPid(int pid) {
		this.pid = pid;
	}




	public String getPname() {
		return pname;
	}




	public void setPname(String pname) {
		this.pname = pname;
	}




	public String getPduration() {
		return pduration;
	}




	public void setPduration(String pduration) {
		this.pduration = pduration;
	}




	public String getPplatfrom() {
		return pplatfrom;
	}




	public void setPplatfrom(String pplatfrom) {
		this.pplatfrom = pplatfrom;
	}




	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pduration=" + pduration + ", pplatfrom=" + pplatfrom
				+ "]";
	}

	
	
	
}
