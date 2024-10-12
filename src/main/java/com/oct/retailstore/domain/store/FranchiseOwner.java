package com.oct.retailstore.domain.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FranchiseOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int owner_id;
	private String owner_name;
	
	@OneToOne
	@JoinColumn( name="store_id", referencedColumnName="store_id")
	private Store store;

	public FranchiseOwner(String owner_name, Store store) {
		super();
		this.owner_name = owner_name;
		this.store = store;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
	
}
