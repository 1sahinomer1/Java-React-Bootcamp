
public class Student extends User {
	
	private String studentNumber;
	private String lesson;
	
	public Student(int id, String name, String lastName, String email,String studentNumber,String lesson) {
		super(id, name, lastName, email);
		this.studentNumber=studentNumber;
		this.lesson=lesson;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	
}
