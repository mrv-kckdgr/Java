package Entities;

import java.util.Date;

import Abstract.CustomerService;
import Abstract.Entity;

public class Customer implements CustomerService, Entity{
	int id;
	String firstName;
	String lastName;
	int birthDate;
	Long nationalityId;
	
	//boş ctor olmazsa get ve set ler kullanılamaz
	public Customer() {
		
		
	}
	
	public Customer(int id, String firstName, String lastName, int birthDate, Long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalityId = nationalityId;
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


	public int getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}


	public Long getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}


	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
