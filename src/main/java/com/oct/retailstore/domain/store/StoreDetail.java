package com.oct.retailstore.domain.store;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StoreDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detail_id;
    private String city;
    private String contact_number;
    
    @OneToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    @JsonIgnore // To break cyclic reference in json serialization
    private Store store;

	public StoreDetail() {
	}

	public StoreDetail(String city, String contact_number) {
		this.city = city;
		this.contact_number = contact_number;
	}

	public Integer getDetail_id() {
		return detail_id;
	}

	public void setDetail_id(Integer detail_id) {
		this.detail_id = detail_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "StoreDetail [detail_id=" + detail_id + ", city=" + city + ", contact_number=" + contact_number
				+ "]";
	}
	
	
    
}

