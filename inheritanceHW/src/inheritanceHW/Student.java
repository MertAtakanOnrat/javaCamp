package inheritanceHW;

public class Student extends User{
	private int classNum;
	private int averagePoints;
	private String classSection;
	
	public Student() {
		classNum = 0;
		averagePoints = 0;
		classSection = "";
	}
	public Student(int classNum, int averagePoints, String classSection) {
		super();
		this.classNum = classNum;
		this.averagePoints = averagePoints;
		this.classSection = classSection;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getAveragePoints() {
		return averagePoints;
	}
	public void setAveragePoints(int averagePoints) {
		this.averagePoints = averagePoints;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
}
