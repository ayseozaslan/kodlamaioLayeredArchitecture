package kodlamaioLayeredArchitecture.dataAccess;

import kodlamaioLayeredArchitecture.entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	public void add(Course course) {
		System.out.println("Kurs JDBC ile sisteme eklendi");
		
	}
	
	
	public void delete(Course course) {
		System.out.println("Kurs JDBC ile sistemden silindi.");
		
	}

	
	public void update(Course course) {
		System.out.println("Kurs JDBC ile sistemden güncellendi.");
		
	}

}
