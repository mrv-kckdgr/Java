package thirdDayHomework;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Category category1 = new Category(1, "Tümü");
		Category category2 = new Category(2, "Programlama");
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		Category category3 = new Category(3, "Veri Bilimi");
		category3 = categoryManager.update(category3);
		
		Category[] categories= {category1, category2, category3};
		categoryManager.delete(category1);
		
		
		Education education1 = new Education(1, "C#");
		Education education2 = new Education(2, "Java");
		Education[] educations= {education1, education2};
		
		
		Instructor instructor1=new Instructor(1, 1, "Engin", "DEMİROĞ");
		Instructor instructor2=new Instructor(2, 2, "Engin", "DEMİROĞ");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructor2 = instructorManager.update(instructor2);
		Instructor[] instructors= {instructor1, instructor2};
		
		
		for(Category category:categories) {
			System.out.println(category.name);
		}
		
		for(Education education:educations) {
			System.out.println(education.name);
		}
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.firstName + " " + instructor.lastName + " " + instructor.educationId);			
		}	
	}
}