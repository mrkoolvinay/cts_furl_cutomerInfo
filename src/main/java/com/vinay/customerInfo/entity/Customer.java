package com.vinay.customerInfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
	
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;

}
