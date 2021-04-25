package thirdDayHomework;

public class CategoryManager {
	private static final int NULL = 0;
	Category category1 = new Category();
	public Category add(Category category) {
		
		category1.id=category.id;
		category1.name=category.name;
		System.out.println("Kategori ekleme işlemi başarılı");		
		return category1;
	}
	
	//Eğitimlerin başına "KODLAMA" ifadesi getirme
	public Category update(Category category) {
		category1.id=category.id;
		category1.name = "KODLAMA EĞİTİMİ " + category.name;
		System.out.println("Kategori güncelleme işlemi başarılı");		
		return category1;
	}
	
	public Category delete(Category category) {
		category1.id=NULL;
		category1.name="";
		System.out.println("Kategori silme işlemi başarılı");	
		return category1;
	}

}
