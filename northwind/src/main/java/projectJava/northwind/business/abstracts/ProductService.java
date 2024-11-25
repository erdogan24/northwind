package projectJava.northwind.business.abstracts;

import java.util.List;

import projectJava.northwind.core.utilities.results.DataResult;
import projectJava.northwind.core.utilities.results.Result;
import projectJava.northwind.entities.concretes.Product;

public interface ProductService {
 	DataResult<List<Product>> getAll();
 	Result add(Product product);
}
