package kodlamaioLayeredArchitecture.business;
import kodlamaioLayeredArchitecture.entities.Course;
import kodlamaioLayeredArchitecture.core.logging.Logger;
import kodlamaioLayeredArchitecture.dataAccess.CourseDao;
import kodlamaioLayeredArchitecture.dataAccess.HibernateCourseDao;
import kodlamaioLayeredArchitecture.dataAccess.JdbcCourseDao;
import kodlamaioLayeredArchitecture.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao; 
	private Logger[] loggers;
	private String CourseName;
	
	
	public CourseManager(CourseDao courseDao ,Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers=loggers;
	}
	public void add(Course course) throws Exception {
		if(course.getPrice()<=0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		Course[] courses= {new Course("Javaya giriş",8,5000),new Course("Python a giriş",9,6000)};
		for (Course item : courses) {
            if (course.getCourseName()==item.getCourseName()){
				throw new Exception("Bu kurs adı daha önce eklendi.Farklı bir kurs ismi yazınız.");
			}
			
			courseDao.add(course);
			System.out.println("Kurs eklendi");
			for(Logger logger:loggers) {
				logger.log();
			}
		}
	}
			
			
		
	public void delete(int courseId) {
		System.out.println("course silindi.");
		
	}

	
	public void update(Course course) {
		System.out.println("course güncellendi.");
		
	}
	
		
		
		
	}

