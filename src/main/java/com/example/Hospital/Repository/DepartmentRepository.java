package com.example.Hospital.Repository;

import org.springframework.stereotype.Repository;
import com.example.Hospital.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
	public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
