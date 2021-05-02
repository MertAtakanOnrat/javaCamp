package inheritanceHW;

public class Instructor extends User{
	private String branch;
	private int numOfStudents;
	private int numOfSections;
	
	public Instructor() {
		branch = "";
		numOfStudents = 0;
		numOfSections = 0;
	}
	public Instructor(String branch, int numOfStudents, int numOfSections) {
		super();
		this.branch = branch;
		this.numOfStudents = numOfStudents;
		this.numOfSections = numOfSections;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	public int getNumOfSections() {
		return numOfSections;
	}
	public void setNumOfSections(int numOfSections) {
		this.numOfSections = numOfSections;
	}
}
