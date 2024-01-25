	package com.example.Hospital.Repository;

	import com.example.Hospital.Entity.Patient;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface PatientRepository extends JpaRepository<Patient, Long> {
	    
	}




