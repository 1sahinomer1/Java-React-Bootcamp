
public class Instructor extends User {
	
	private String lesson;
	private String certificate;
	
	public Instructor(int id, String name, String lastName, String email,String lesson,String certificate) {
		super(id, name, lastName, email);
		this.lesson=lesson;
		this.certificate=certificate;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	
}
