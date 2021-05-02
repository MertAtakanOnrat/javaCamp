package inheritanceHW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor = new Instructor();
		instructor.setId(1234);
		
		Student student = new Student();
		student.setId(5678);
		
		User[] users = {instructor, student};
		
		UserManager userManager = new UserManager();	
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToCourse();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToCourse();
		}

}
