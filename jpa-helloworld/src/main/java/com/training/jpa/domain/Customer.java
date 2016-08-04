package com.training.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name = "CUSTOMER") // Name of the entity
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7780259141882240116L;

	@Id // signifies the primary key
	@Column(name = "CUST_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long custId;

	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	// By default column name is same as attribute name
	private String street;

	@Column(name = "APPT", nullable = false)
	private String appt;

	// By default column name is same as attribute name
	private String city;

	@Column(name = "ZIP_CODE", nullable = false)
	// Name of the corresponding database column
	private String zipCode;

	@Column(name = "CUST_TYPE", length = 10)
	private String custType;

	@Version
	@Column(name = "LAST_UPDATED_TIME")
	private Date updatedTime;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAppt() {
		return appt;
	}

	public void setAppt(String appt) {
		this.appt = appt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

}
