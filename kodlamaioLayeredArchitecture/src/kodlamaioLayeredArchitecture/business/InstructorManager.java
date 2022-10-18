package kodlamaioLayeredArchitecture.business;

import kodlamaioLayeredArchitecture.core.logging.Logger;
import kodlamaioLayeredArchitecture.dataAccess.InstructorDao;
import kodlamaioLayeredArchitecture.entities.Category;
import kodlamaioLayeredArchitecture.entities.Course;
import kodlamaioLayeredArchitecture.entities.Instructor;

public class InstructorManager {
	private InstructorDao ınstructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao ınstructorDao,Logger[] loggers) {
		this.ınstructorDao=ınstructorDao;
		this.loggers=loggers;
	}

	public void add(Instructor ınstructor) {
		ınstructorDao.add(ınstructor);
		System.out.println("Eğitmen eklendi");
		
		for(Logger logger:loggers) {
			logger.log();
		}
	
	}
     
	public void delete(Instructor ınstructor) {
		System.out.println("Eğitmen silindi");
		
	}
	
	public void update(Instructor ınstrcutor) {
		System.out.println("Eğitmen silindi");
	}
	
	
}
