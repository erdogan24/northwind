package projectJava.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectJava.northwind.business.abstracts.ProductService;
import projectJava.northwind.core.utilities.results.DataResult;
import projectJava.northwind.core.utilities.results.SuccessDataResult;
import projectJava.northwind.dataAccess.abstracts.ProductDao;
import projectJava.northwind.entities.concretes.Product;


@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>> 
		(this.productDao.findAll(),"Data Listelendi");
				
				
	}

}