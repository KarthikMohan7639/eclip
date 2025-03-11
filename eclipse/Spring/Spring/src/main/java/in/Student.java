package in;

public class Student {
//	Student() {
//		System.out.println("Student constructor called");
//	}
//	void details() {
//		System.out.println("ID=1, NAME=TOM");
//	}
	
	private int id;
	private String name;
	private double marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
