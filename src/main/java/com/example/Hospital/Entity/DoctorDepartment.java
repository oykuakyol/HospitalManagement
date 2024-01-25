package com.example.Hospital.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor_department")
public class DoctorDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Ekstra alanlar
    private String doctorName;
    private String doctorSurname;
    

    private String departmentName;

   

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getdoctorSurname() {
        return doctorSurname;
    }
    
    
    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

	public List<DoctorDepartment> getAllDoctorDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public DoctorDepartment createDoctorDepartment(DoctorDepartment doctorDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	public DoctorDepartment updateDoctorDepartment(Long id2, DoctorDepartment updatedDoctorDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public List<DoctorDepartment> getDepartmentsByDoctor(Long doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DoctorDepartment> getDoctorsByDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createDoctorDepartment(Long id) {
		// TODO Auto-generated method stub
		
	}

	public DoctorDepartment getDoctorDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	}
