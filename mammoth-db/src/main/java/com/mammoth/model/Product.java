package com.mammoth.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name="product")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String barcode;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String name;

	private Double price;

	private BigInteger quantity;

	@Temporal(TemporalType.DATE)
	@Column(name="self_life")
	private Date selfLife;

	//bi-directional many-to-one association to SalePercentage
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sale_percentage_id")
	private SalePercentage salePercentage;

	public Product() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public BigInteger getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

	public Date getSelfLife() {
		return this.selfLife;
	}

	public void setSelfLife(Date selfLife) {
		this.selfLife = selfLife;
	}

	public SalePercentage getSalePercentage() {
		return this.salePercentage;
	}

	public void setSalePercentage(SalePercentage salePercentage) {
		this.salePercentage = salePercentage;
	}

}