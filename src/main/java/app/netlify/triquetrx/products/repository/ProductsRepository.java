package app.netlify.triquetrx.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.netlify.triquetrx.products.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
