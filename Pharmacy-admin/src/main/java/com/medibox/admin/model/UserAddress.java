package com.medibox.admin.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UserAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userAddressId;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "userAddress")
	private List<OrderMaster> orderMasters;

	@Column(nullable = false)
	private String mobileNumber;

	@Column(length = 1000)
	private String localityAreaStreet;

	private String landmark;

	@Column(nullable = false, length = 50)
	private String city;

	@Column(nullable = false)
	private String state;

	@Column(nullable = false, length = 6)
	private int pincode;

	public int getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(int userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLocalityAreaStreet() {
		return localityAreaStreet;
	}

	public void setLocalityAreaStreet(String localityAreaStreet) {
		this.localityAreaStreet = localityAreaStreet;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<OrderMaster> getOrderMasters() {
		return orderMasters;
	}

	public void setOrderMasters(List<OrderMaster> orderMasters) {
		this.orderMasters = orderMasters;
	}

	@Override
	public String toString() {
		return "UserAddress [userAddressId=" + userAddressId + ", name=" + name + ", user=" + user + ", orderMasters="
				+ orderMasters + ", mobileNumber=" + mobileNumber + ", localityAreaStreet=" + localityAreaStreet
				+ ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
