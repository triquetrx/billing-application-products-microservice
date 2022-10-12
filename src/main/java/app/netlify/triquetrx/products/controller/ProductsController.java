package app.netlify.triquetrx.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.netlify.triquetrx.products.dto.ProductsDTO;
import app.netlify.triquetrx.products.model.Products;
import app.netlify.triquetrx.products.service.ProductService;

@RestController
@CrossOrigin
public class ProductsController {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<?> getAllProducts() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> addNewProduct(@RequestBody ProductsDTO productsDTO) {
		Products result = service.addNewProduct(productsDTO);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getProductById(@PathVariable int id){
		return new ResponseEntity<>(service.getById(id),HttpStatus.OK);
	}

	@GetMapping("/count")
	public ResponseEntity<?> getCount() {
		return new ResponseEntity<>(service.count(), HttpStatus.OK);
	}

}
