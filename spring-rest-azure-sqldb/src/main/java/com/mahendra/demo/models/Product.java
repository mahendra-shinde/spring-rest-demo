package com.mahendra.demo.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="products")
public class Product implements Serializable {
	
	@Id @Column(name="prodid")
	private Integer productId;
	
	@Column(name="pname",length=20)
	private String name;
	
	@Column(name="price")
	private Float price;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
