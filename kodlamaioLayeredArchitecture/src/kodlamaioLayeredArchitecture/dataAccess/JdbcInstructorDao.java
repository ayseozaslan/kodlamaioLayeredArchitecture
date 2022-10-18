package kodlamaioLayeredArchitecture.dataAccess;

import kodlamaioLayeredArchitecture.entities.Course;
import kodlamaioLayeredArchitecture.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	public void add(Course course) {
		System.out.println("Eğitmen JDBC ile sisteme eklendi");
		
	}
	
	
	public void delete(Course course) {
		System.out.println("Eğitmen JDBC ile sistemden silindi.");
		
	}

	
	public void update(Course course) {
		System.out.println("Eğitmen JDBC ile sistemden güncellendi.");
		
	}


	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}


}
