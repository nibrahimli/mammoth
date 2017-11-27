package com.mammoth.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sale database table.
 * 
 */
@Entity
@Table(name="sale")
@NamedQuery(name="Sale.findAll", query="SELECT s FROM Sale s")
public class Sale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="total_price")
	private Double totalPrice;

	//uni-directional many-to-many association to Product
	@ManyToMany
	@JoinTable(
		name="sale_product"
		, joinColumns={
			@JoinColumn(name="sale_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="product_id")
			}
		)
	private List<Product> products;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public Sale() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}