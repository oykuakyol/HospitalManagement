
	package com.example.Hospital.Repository;

	import com.example.Hospital.Entity.Registration;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface RegistrationRepository extends JpaRepository<Registration, Long> {
	
	}

