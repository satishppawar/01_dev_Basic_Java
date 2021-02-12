package common.java.model;

import java.util.ArrayList;
import java.util.List;

import common.java.types.City;

public class Person {

	String wardNo;
	int id;
	String firstName;
	String lastName;
	City city;

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public Person(String wardNo, int id, String firstName, String lastName, City city) {
		super();
		this.wardNo = wardNo;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

	public Person() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [wardNo=" + wardNo + ", id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", city=" + city + "]";
	}

	public List<Person> createPersonList(String wardNo) {
		List<Person> personList = new ArrayList<Person>();
		for (int i = 5; i > 0; i--) {
			String ward = String.valueOf(Integer.valueOf(wardNo) + i);
			Person person = new Person(ward, i, "FirstName_" + wardNo, "lastName_" + wardNo, City.values()[i-1]);
			personList.add(person);
		}
		return personList;

	}

}
