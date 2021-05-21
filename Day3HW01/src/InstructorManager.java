
public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getName()+ " eklendi");
	}

	public void delete(User user) {
		System.out.println(user.getId() + " id'ye ait egitmen silindi");
	}

	public void login() {
		System.out.println("Sisteme girdiniz");
	}
}
