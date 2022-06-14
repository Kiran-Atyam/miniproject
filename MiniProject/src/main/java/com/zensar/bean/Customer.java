package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	
	private int customerId;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + "]";
}

public Customer(int customerId) {
	super();
	this.customerId = customerId;
}

public Customer() {
	super();
}

}
