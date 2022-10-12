package app.netlify.triquetrx.products.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @Data @AllArgsConstructor @NoArgsConstructor class ProductsDTO {
	
	private String productName;
	private String productType;
	private String hsn;
	private double basic;
	private double gst;

}
