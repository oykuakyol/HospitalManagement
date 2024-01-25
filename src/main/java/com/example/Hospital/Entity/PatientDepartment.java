package com.example.Hospital.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "patient_department")
public class PatientDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Ekstra alanlar
    private String patientName;

    private String patientSurname;

    private String departmentName;
    
    // Getter ve Setter metotları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

		
		
		  public String getDepartmentName() {
		        return departmentName;
		    }

		    public void setDepartmentName(String departmentName) {
		        this.departmentName = departmentName;
		    }
		
		
	

	public PatientDepartment getPatientDepartmentById(Long id2) {
		// TODO Auto-generated method stub
		return null;
	}

	public PatientDepartment createPatientDepartment(PatientDepartment patientDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	public PatientDepartment updatePatientDepartment(Long id2, PatientDepartment updatedPatientDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePatientDepartment(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public List<PatientDepartment> getAllPatientDepartments() {
		// TODO Auto-generated method stub
		return null;
	}
}

