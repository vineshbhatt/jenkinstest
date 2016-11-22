package com.example.Beans;


public class UserDetailBean {

	private int Id;
	private String Name;
	private String Place;

	public UserDetailBean(int id, String name, String place) {
		super();
		Id = id;
		Name = name;
		Place = place;
	}

	public UserDetailBean() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

}
