package thirdDayHomework;

public class Instructor {
	int id;
	int educationId;
	String firstName;
	String lastName;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, int educationId, String firstName, String lastName) {
		this.id=id;
		this.educationId=educationId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
}