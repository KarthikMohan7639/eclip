package in;

public class Employee {
	private int id;
	private String ename;
	private double sal;
	private String job;
	public Employee(int id, String ename, double sal, String job) {
		this.id = id;
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + ", job=" + job + "]";
	}
	
	
	
	
}
