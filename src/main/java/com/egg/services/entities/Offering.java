package com.egg.services.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "offering")
public class Offering {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;

	@NotEmpty
	private Boolean state;

	@NotEmpty
	private String serviceType;

	@NotEmpty
	private String description;
	
	public Offering() {
		this.state = true;
	}

	public Offering( @NotEmpty String serviceType, @NotEmpty String description) {
		super();
		this.state = true;
		this.serviceType = serviceType;
		this.description = description;
	}

	
}
