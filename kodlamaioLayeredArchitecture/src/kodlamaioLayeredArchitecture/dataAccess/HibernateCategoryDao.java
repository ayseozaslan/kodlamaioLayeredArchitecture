package kodlamaioLayeredArchitecture.dataAccess;

import kodlamaioLayeredArchitecture.entities.Category;

public class HibernateCategoryDao  implements CategoryDao{
	public void add(Category category) {
		System.out.println("Kategoriler hibernate ile sisteme eklendi");
		
	}
	
	
	public void delete(Category category) {
		System.out.println("Kategoriler hibernate ile sistemden silindi.");
		
	}

	
	public void update(Category category) {
		System.out.println("Kategoriler hibernate ile sistemden güncellendi.");
		
	}

}
