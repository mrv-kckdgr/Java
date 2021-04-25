package oopIntro;

public class Product {
	
	//ctor - yapıcı
	// istediğimiz kod varsa buraya yazarız
	public Product() {
		System.out.println("Ben çalıştım");
	}
	
	//overloading aşırı yükleme
	public Product(int id, String name, double unitPrice, String detail) {
		// Bu class içindeki
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
    int id;
    String name;
    double unitPrice;
    String detail;

}

//Method: iŞ yapan kodblokları
// İş yapan classlar içine yazılır
// S-> her class bir iş yapar
// Özellik tutucu classlar
