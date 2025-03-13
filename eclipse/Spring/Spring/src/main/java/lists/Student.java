package lists;

import java.util.List;

public class Student {

	private int roll_no;
	private String sname;
	private int grade;
	private List<String> subjects;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", sname=" + sname + ", grade=" + grade + ", subjects=" + subjects + "]";
	}
	
	

}
