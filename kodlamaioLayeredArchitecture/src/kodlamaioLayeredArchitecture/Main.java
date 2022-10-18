package kodlamaioLayeredArchitecture;
import kodlamaioLayeredArchitecture.business.CategoryManager;
import kodlamaioLayeredArchitecture.business.CourseManager;
import kodlamaioLayeredArchitecture.business.InstructorManager;
import kodlamaioLayeredArchitecture.core.logging.DatabaseLogger;

import kodlamaioLayeredArchitecture.core.logging.Logger;

import kodlamaioLayeredArchitecture.dataAccess.JdbcCategoryDao;
import kodlamaioLayeredArchitecture.dataAccess.JdbcCourseDao;
import kodlamaioLayeredArchitecture.dataAccess.JdbcInstructorDao;
import kodlamaioLayeredArchitecture.entities.Category;
import kodlamaioLayeredArchitecture.entities.Course;
import kodlamaioLayeredArchitecture.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course courses=new Course("c# a  giriş",8,5000);
		Logger[] loggers= {new DatabaseLogger()};
			
		CourseManager courseManager= new CourseManager (new JdbcCourseDao(), loggers);
		courseManager.add(courses);
		
		Category category1=new Category(2,"web");
		CategoryManager categoryManager=new CategoryManager (new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);
		
		Instructor ınstructor3=new Instructor(9,"Engin","Demiroğ");
		InstructorManager ınstructorManager=new InstructorManager(new JdbcInstructorDao(),loggers);
		ınstructorManager.add(ınstructor3);
		
		
		
		
		

	}

}
