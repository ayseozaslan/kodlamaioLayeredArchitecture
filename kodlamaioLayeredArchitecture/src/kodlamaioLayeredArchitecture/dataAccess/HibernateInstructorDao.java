package kodlamaioLayeredArchitecture.dataAccess;

import kodlamaioLayeredArchitecture.entities.Course;
import kodlamaioLayeredArchitecture.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add(Course course) {
		System.out.println("Eğitmen hibernate ile sisteme eklendi");
		
	}
	
	
	public void delete(Course course) {
		System.out.println("Eğitmen hibernate ile sistemden silindi.");
		
	}

	
	public void update(Course course) {
		System.out.println("Eğitmen hibernate ile sistemden güncellendi.");
		
	}


	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

}
