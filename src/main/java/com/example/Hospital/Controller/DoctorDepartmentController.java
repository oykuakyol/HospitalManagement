package com.example.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Hospital.Entity.DoctorDepartment;

import java.util.List;

@RestController
@RequestMapping("/doctor-departments")
public class DoctorDepartmentController {

    private final DoctorDepartment doctorDepartmentService;

    @Autowired
    public DoctorDepartmentController(DoctorDepartment doctorDepartmentService) {
        this.doctorDepartmentService = doctorDepartmentService;
    }

    // Tüm doctor-department bilgilerini getir
    @GetMapping
    public List<DoctorDepartment> getAllDoctorDepartments() {
        return doctorDepartmentService.getAllDoctorDepartments();
    }

    // Belirli bir doctor-department'ı getir
    @GetMapping("/{id}")
    public DoctorDepartment getDoctorDepartmentById(@PathVariable Long id) {
        return doctorDepartmentService.getDoctorDepartmentById(id);
    }

    // Yeni bir doctor-department oluştur
    @PostMapping
    public DoctorDepartment createDoctorDepartment(@RequestBody DoctorDepartment doctorDepartment) {
        return doctorDepartmentService.createDoctorDepartment(doctorDepartment);
    }

    // Belirli bir doctor-department'ı güncelle
    @PutMapping("/{id}")
    public DoctorDepartment updateDoctorDepartment(@PathVariable Long id, @RequestBody DoctorDepartment updatedDoctorDepartment) {
        return doctorDepartmentService.updateDoctorDepartment(id, updatedDoctorDepartment);
    }

    // Belirli bir doctor-department'ı sil
    @DeleteMapping("/{id}")
    public void deleteDoctorDepartment(@PathVariable Long id) {
        doctorDepartmentService.createDoctorDepartment(id);
    }
}

