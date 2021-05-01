package reCapKodlamaio;

public class Instructor extends User {
	String courseName;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String passworde) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		courseName = courseName;
	}
}
