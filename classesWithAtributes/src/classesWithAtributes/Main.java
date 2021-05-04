package classesWithAtributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus", 2, 5);
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Kulaklık");
		product2.setPrice(25);
		product2.setDescription("ASUS");
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
		
		System.out.println(product.getKod());
		
		
	}

}
