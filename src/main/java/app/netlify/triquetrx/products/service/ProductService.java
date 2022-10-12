package app.netlify.triquetrx.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.netlify.triquetrx.products.dto.ProductsDTO;
import app.netlify.triquetrx.products.model.Products;
import app.netlify.triquetrx.products.repository.ProductsRepository;

@Service
public class ProductService {

	@Autowired
	ProductsRepository repository;

	public List<Products> getAll() {
		return repository.findAll();
	}

	public Products addNewProduct(ProductsDTO productsDTO) {
		return repository.save(new Products(productsDTO.getProductName(), productsDTO.getProductType(),
				productsDTO.getHsn(), productsDTO.getBasic(), productsDTO.getGst(),
				productsDTO.getBasic()+(productsDTO.getBasic() * (productsDTO.getGst() / 100))));
	}
	
	public long count() {
		return repository.count();
	}
	
	public Products getById(int id) {
		return repository.findById(id).get();
	}

}
