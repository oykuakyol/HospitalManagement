package com.example.Hospital.Controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

import com.example.Hospital.Entity.PatientDepartment;

import java.util.List;

	@RestController
	@RequestMapping("/patient-departments")
	public class PatientDepartmentController {

	    private final PatientDepartment patientDepartmentService;

	    @Autowired
	    public PatientDepartmentController(PatientDepartment patientDepartmentService) {
	        this.patientDepartmentService = patientDepartmentService;
	    }

	    // Tüm patient-department bilgilerini getir
	    @GetMapping
	    public List<PatientDepartment> getAllPatientDepartments() {
	        return patientDepartmentService.getAllPatientDepartments();
	    }

	    // Belirli bir patient-department'ı getir
	    @GetMapping("/{id}")
	    public PatientDepartment getPatientDepartmentById(@PathVariable Long id) {
	        return patientDepartmentService.getPatientDepartmentById(id);
	    }

	    // Yeni bir patient-department oluştur
	    @PostMapping
	    public PatientDepartment createPatientDepartment(@RequestBody PatientDepartment patientDepartment) {
	        return patientDepartmentService.createPatientDepartment(patientDepartment);
	    }

	    // Belirli bir patient-department'ı güncelle
	    @PutMapping("/{id}")
	    public PatientDepartment updatePatientDepartment(@PathVariable Long id, @RequestBody PatientDepartment updatedPatientDepartment) {
	        return patientDepartmentService.updatePatientDepartment(id, updatedPatientDepartment);
	    }

	    // Belirli bir patient-department'ı sil
	    @DeleteMapping("/{id}")
	    public void deletePatientDepartment(@PathVariable Long id) {
	        patientDepartmentService.deletePatientDepartment(id);
	    }
	}


