package projectJava.northwind.business.abstracts;

import java.util.List;

import projectJava.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
