package com.example.Hospital.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hospital.Entity.DoctorDepartment;

@Repository
public interface DoctorDepartmentRepository extends JpaRepository<DoctorDepartment, Long> {

}
	

