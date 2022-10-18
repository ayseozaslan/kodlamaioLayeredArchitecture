package kodlamaioLayeredArchitecture.entities;

public class Course {
	
	private String courseName;
	private int categoryId;
	private double price;
	public Course() {
		super();
	}
	public Course(String name, int categoryId, double price) {
		super();
		this.courseName = name;
		this.categoryId = categoryId;
		this.price = price;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setName(String name) {
		this.courseName = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
