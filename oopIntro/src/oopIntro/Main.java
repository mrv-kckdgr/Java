package oopIntro;

public class Main {

	public static void main(String[] args) {
		// Stack = Heap
		Product product1 = new Product(); //instance, referans oluşturma
        product1.setId(2);
        product1.setName("Lenovo V15");
        product1.setDetail("16 gb ram");
        product1.setDiscount(10);
        product1.setUnitPrice(16000);
        
        System.out.println(product1.getUnitPriceAfterDiscount());     
        
        
        
        
        Product[] products={product1};
        
        for (Product product:products) {
        	System.out.println(product.getName());
        }
        System.out.println(products.length);
        
        
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");
        
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Ev-Bahçe");
        
        System.out.println(category1.getName());
        System.out.println(category2.getName());
        
        ProductManager productManager=new ProductManager();
        // product ' ın bellek adresini göndermiş oluyoruz
        productManager.addToCart(product1);

	}

}

// class lar referans tiptir
