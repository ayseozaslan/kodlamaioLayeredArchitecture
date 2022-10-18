package kodlamaioLayeredArchitecture.dataAccess;

import kodlamaioLayeredArchitecture.entities.Category;
import kodlamaioLayeredArchitecture.entities.Course;

public class JdbcCategoryDao  implements CategoryDao {

	public void add(Category category) {
		System.out.println("Kategoriler JDBC ile sisteme eklendi");
		
	}
	
	
	public void delete(Category category) {
		System.out.println("Kategoriler JDBC ile sistemden silindi.");
		
	}

	
	public void update(Category category) {
		System.out.println("Kategoriler JDBC ile sistemden güncellendi.");
		
	}


}
