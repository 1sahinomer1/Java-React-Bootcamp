
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"React&Java", "Engin Demirog");
		Course course2 = new Course(1,"Programlamaya Giris", "Engin Demirog");	
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.nextPage(course2);
		courseManager.previousPage(course1);
	}

}
