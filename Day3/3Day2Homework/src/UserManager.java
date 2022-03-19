
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName + " - " + user.lastName + " eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " - " + user.lastName + " güncellendi");
	}
	
	public void remove(User user) {
		System.out.println(user.firstName + " - " + user.lastName + " silindi");
	}
	
}
