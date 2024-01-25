package com.example.Hospital.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Patient {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 Long id;

	    String name;
	String surname;
	
	@OneToOne(cascade=CascadeType.ALL)
  Registration registration;
	
  
  @ManyToMany
  @JoinTable(
	        name = "patient_department",
	        joinColumns = @JoinColumn(name = "patient_id"),
	        inverseJoinColumns = @JoinColumn(name = "department_id")
	       
	    )
	    private Set<Department> departments;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Department getDepartment() {
		return getDepartment();
	}
	

	
	public void setDepartment(Department department) {
		this.departments = (Set<Department>) department;
	}
	
	
	  public Registration getRegistration() {
	        return registration;
	    }

	    public void setRegistration(Registration registration) {
	        this.registration = registration;
	    }


	
	
	
	
	
}
