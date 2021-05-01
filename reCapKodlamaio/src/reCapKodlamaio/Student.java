package reCapKodlamaio;

public class Student extends User {
	String comment;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String password) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
