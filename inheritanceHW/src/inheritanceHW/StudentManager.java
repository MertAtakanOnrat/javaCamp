package inheritanceHW;

public class StudentManager extends UserManager{
	@Override
	public void addToCourse() {
		System.out.println("Öğrenci derse kayıt edildi.");
	}
}
