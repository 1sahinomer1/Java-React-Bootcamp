
public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "omer", "sahin", "1sahinomer1@gmail.com","22","java");
		Instructor instructor = new Instructor(2, "engin", "demirog", "engin@gmail.com", "java", "javajdk");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}

}
