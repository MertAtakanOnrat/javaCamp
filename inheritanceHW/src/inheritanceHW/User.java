package inheritanceHW;

public class User {
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String gender;
	
	public User() {
		id = 0;
		age = 0;
		firstName = "";
		lastName = "";
		gender = "";
	}
	public User(int id, int age, String firstName, String lastName, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
