package com.mammoth.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the sale_percentage database table.
 * 
 */
@Entity
@Table(name="sale_percentage")
@NamedQuery(name="SalePercentage.findAll", query="SELECT s FROM SalePercentage s")
public class SalePercentage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private Double percent;

	public SalePercentage() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPercent() {
		return this.percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

}