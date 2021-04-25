package oopIntro;

public class Main {

	public static void main(String[] args) {
		// Stack = Heap
		Product product1 = new Product(); //instance, referans oluşturma
        product1.id=1;
        product1.name="Lenovo V14";
        product1.unitPrice = 15000;
        product1.detail = "16 GB RAM";
        
        Product product2 = new Product();
        product2.id=1;
        product2.name="Lenovo V15";
        product2.unitPrice = 16000;
        product2.detail = "16 GB RAM";
        
        Product product3 = new Product();
        product3.id=1;
        product3.name="HP 5";
        product3.unitPrice = 16000;
        product3.detail = "16 GB RAM";
        
        Product product4 = new Product(4, "HP 6", 17000, "16 GB Ram"); //instance, referans oluşturma
        
        Product[] products={product1, product2, product3};
        
        for (Product product:products) {
        	System.out.println(product.name);
        }
        System.out.println(products.length);
        
        
        Category category1 = new Category();
        category1.id=1;
        category1.name="Bilgisayar";
        
        Category category2 = new Category();
        category2.id=2;
        category2.name="Ev-Bahçe";
        
        ProductManager productManager=new ProductManager();
        // product ' ın bellek adresini göndermiş oluyoruz
        productManager.addToCart(product1);
        
        productManager.addToCart(product2);
        productManager.addToCart(product3);

	}

}

// class lar referans tiptir
