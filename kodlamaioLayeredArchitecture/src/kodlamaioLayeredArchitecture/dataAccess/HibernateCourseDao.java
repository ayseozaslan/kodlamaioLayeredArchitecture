package kodlamaioLayeredArchitecture.dataAccess;

import kodlamaioLayeredArchitecture.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Kurs hibernate ile sisteme eklendi");
		
	}
	
	
	public void delete(Course course) {
		System.out.println("Kurs hibernate ile sistemden silindi.");
		
	}

	
	public void update(Course course) {
		System.out.println("Kurs hibernate ile sistemden güncellendi.");
		
	}

}
