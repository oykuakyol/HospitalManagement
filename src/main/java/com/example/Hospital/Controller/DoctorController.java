package com.example.Hospital.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Hospital.Entity.Doctor;
import com.example.Hospital.Repository.DoctorRepository;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable Long id) {
        return doctorRepository.findById(id);
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor updatedDoctor) {
        return doctorRepository.findById(id)
                .map(doctor -> {
                    doctor.setDoctorName(updatedDoctor.getDoctorName());
                    doctor.setDoctorSurname(updatedDoctor.getDoctorSurname());
                    doctor.setDepartment(updatedDoctor.getDepartment());
                    return doctorRepository.save(doctor);
                })
                .orElseGet(() -> {
                    updatedDoctor.setId(id);
                    return doctorRepository.save(updatedDoctor);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorRepository.deleteById(id);
    }
}