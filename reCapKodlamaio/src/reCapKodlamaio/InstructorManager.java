package reCapKodlamaio;

import java.util.Iterator;

public class InstructorManager extends UserManager {
	
	public void addCourse(String course) {
		System.out.println("**********Add Course***********");
		System.out.println("Eğitmenimize ait kurs eklenmiştir. Eklenen kursumuz : " + course);
		System.out.println("**********Add Course Finish***********");
	}
	
	public void addCourses(String[] courses) {
		System.out.println("**********Add Courses***********");
		System.out.println("Eğitmenimize ait kurslar eklenmiştir. Eklenen kurslarımız :");
		for (int i = 0; i<courses.length; i++) {
			System.out.println(courses[i]);			
		}
		System.out.println("**********Add Courses Finish***********");
	}
	
	public void listCourses(String[] courses) {
		
	}
}
