package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);	
	void update(Product product);	
	void delete(Product product);
	Product get(int id);
	//List arrayList in base i
	List<Product> getAll();
}


//array ler sabit yapılardır
//arrayList kullanırız eleman kısıtlaması yoktur