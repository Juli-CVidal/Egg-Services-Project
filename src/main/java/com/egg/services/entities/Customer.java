package com.egg.services.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.egg.services.enums.Rol;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer")
public final class Customer extends Person {

	@NotEmpty
	private String direction;
	
	
	@OneToMany
	@JoinColumn(name = "review_id")
	private List<Review> reviews;

	@NotEmpty
	private boolean state;

	public Customer() {
		super();
		rol = Rol.CUSTOMER;
	}

	public Customer(String name, String lastname, String phoneNumber, String mail, String image,
			String password, String direction) {
		super(name, lastname, phoneNumber, mail, image, password, Rol.CUSTOMER);
		this.state = true;
	}

}
