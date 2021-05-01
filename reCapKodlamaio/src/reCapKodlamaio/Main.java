package reCapKodlamaio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student(1, "Merve", "KÜÇÜKDOĞRU", "merve@merve.com", "12345");
		String[] comments = new String[] {"Çok beğendim", "Sürekli devam ettim"} ;
		student.setComment("Python kampı bekliyorum");			
			
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.addComment(student.getComment());
		studentManager.listComment(comments);
		
		Instructor instructor=new Instructor(1, "Engin", "DEMİROĞ", "engin@engin.com","123445");
		
		InstructorManager instructorManager=new InstructorManager();
		String[] courses=new String[] {"JAVA", "PYTHON"};
		instructorManager.addCourses(courses);
		instructorManager.addCourse("ANGULAR");
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		User[] users=new User[] {student, instructor};
		userManager.addingMultipleUsers(users);

	}

}
