package com.example.Hospital.Repository;



	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.Hospital.Entity.PatientDepartment;

	@Repository
	public interface PatientDepartmentRepository extends JpaRepository<PatientDepartment, Long> {
	}





