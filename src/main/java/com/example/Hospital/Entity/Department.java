package com.example.Hospital.Entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity

public class Department {

	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String departmentName;
	
	
	
    @OneToMany
     List<Doctor> doctors;
    
    @ManyToMany(mappedBy="departments",cascade=CascadeType.ALL)
    private Set<Patient> patients;


public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public List<Doctor> getDoctors() {
		return doctors;
	}

	 public void setDoctors(List<Doctor> doctors) {
	        this.doctors = doctors;
	    }
	
	 
	 public List<Patient> getPatients() {

		return (List<Patient>) patients; 
	 }
	public void setPatients(List<Patient> patients) {
		this.patients = (Set<Patient>) patients;
	}

	
		
	}
	
	
    
    
    
    

