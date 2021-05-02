package inheritanceHW;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId() + " numaralı kullanıcı sisteme kayıt edildi.");
	}
	//bulk insert
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	public void addToCourse() {
		System.out.println("Derse kayıt edildi.");
	}
}
