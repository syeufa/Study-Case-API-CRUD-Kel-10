package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "product")
public class Product extends BaseEntity{
	
	@Column(name = "bpom", nullable = false, length = 200)
	private String bpom;
	
	

	public Product() {
		super();		
	}

	public String getBPOM() {
		return bpom;
	}

	public void setBPOM(String bpom) {
		this.bpom = bpom;
	}

}
