package kodlamaioLayeredArchitecture.business;

import kodlamaioLayeredArchitecture.core.logging.Logger;
import kodlamaioLayeredArchitecture.dataAccess.CategoryDao;
import kodlamaioLayeredArchitecture.dataAccess.JdbcCategoryDao;
import kodlamaioLayeredArchitecture.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	public void add(Category category) throws Exception {
		Category[] categorys= {new Category(1,"Mobil"),new Category(2,"Web")};
      for(Category c:categorys) {
		if(category.getName()==c.getName()) {
			throw new Exception("Bu categori adı daha önce eklendi.Farklı bir categori ismi yazınız.");
		}
      }
		
		
		categoryDao.add(category);
		System.out.println("Kategori eklendi");
		for(Logger logger:loggers) {
			logger.log();
		}
		
	}
	public void delete(int id) {
		System.out.println("Kategoriler Jdbc ile  veritanından silindi");
	}
	public void update(Category category) {
		System.out.println("Kategoriler Jdbc ile veritabanına güncellendi ");
	}
}
