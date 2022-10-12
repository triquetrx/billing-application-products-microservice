package app.netlify.triquetrx.products.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
public @NoArgsConstructor @Data class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private String productType;
	private String hsn;
	private double basic;
	private double gst;
	private double total;

	public Products(String productName, String productType, String hsn, double basic, double gst, double total) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.hsn = hsn;
		this.basic = basic;
		this.gst = gst;
		this.total = total;
	}

}
