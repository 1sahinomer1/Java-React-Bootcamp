
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getName()+ " adlı ogrenci eklendi");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getId()+ " idye ait  ogrenci sistemden silindi");
	}
	
	 public void doHomework(Student student) {
	    	System.out.println(student.getName() + " ödevini yapti");
	}
}
