package com.example.Hospital.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity


public class Registration {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
    String hospitalName;	
	
	
	
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Patient patient;



	public String getHospitalName() {
		return hospitalName;
	}



	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	public String getPatientName() {
        return patient != null ? patient.getName() : null;
    }

    public String getPatientSurname() {
        return patient != null ? patient.getSurname() : null;
    }
}
	
	

