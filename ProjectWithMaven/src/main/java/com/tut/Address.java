package com.tut;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)    //strategy specifies the type of auto increment
	@Column(name="a_id")     //this is used to change the name of the column
	private int addressId;
	
	private String street;
	@Column(length=50) //we can also change the length of the variable	private String street;
	private String City;
	
	// if we use @Transient annotation- that column won't be created
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
	private byte[] image;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String street, String city, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		City = city;
		this.addedDate = addedDate;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", City=" + City + ", addedDate=" + addedDate
				+ ", image=" + Arrays.toString(image) + "]";
	}
	

}
