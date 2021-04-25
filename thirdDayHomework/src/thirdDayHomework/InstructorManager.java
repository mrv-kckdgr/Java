package thirdDayHomework;

public class InstructorManager {
	Instructor instructor1_=new Instructor();
	
	public Instructor add(Instructor instructor) {
		instructor1_.id=instructor.id;
		instructor1_.educationId=instructor.educationId;
		instructor1_.firstName=instructor.firstName;
		instructor1_.lastName=instructor.lastName;
		System.out.println("Eğitmen başarılı bir şekilde eklenmiştir.");
		return instructor1_;
	}
	
	public Instructor update(Instructor instructor) {
		instructor1_.id= 00 + instructor.id;
		instructor1_.educationId= 1000 + instructor.educationId;
		instructor1_.firstName= "EFSANEEEE HOCAMIZ " + instructor.firstName;
		instructor1_.lastName= " *** " + instructor.lastName;
		System.out.println("Eğitmen başarılı bir şekilde güncellenmiştir.");
		return instructor1_;
	}
}
