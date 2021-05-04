package classesWithAtributes;

public class Product {
	
	//ctor
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	//overloading
	public Product() {
		
	}
	// attribute or field
	
	//varsayılan olarak hiçbir şey yazmazsak public olarak işaretlemiş oluruz
	// C# da default private
	//public halka açık
	//private sadece tanımlandığı blokta geçerli demek
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;  //mesela sadece okunabilir yapmak istersek getter ve setter bloklarına ihtiyacımız olur
	
	
	//Id okuyabilir
	//sadece readonly
	public int getId() {
		//baska islemler
		return id;
	}
	
	public void setId(int id) {
		//içerisinde bulunduğum class
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}
	
	
}
