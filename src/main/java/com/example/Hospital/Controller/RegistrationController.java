package com.example.Hospital.Controller;

import com.example.Hospital.Entity.Registration;
import com.example.Hospital.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

   RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationController(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    @GetMapping("/{hospitalName}")
    public Optional<Registration> getRegistrationByHospitalName(@PathVariable Long hospitalName) {
        return registrationRepository.findById(hospitalName);
    }

   
    @PostMapping
    public Registration createRegistration(@RequestBody Registration registration) {
        return registrationRepository.save(registration);
    }

    @PutMapping("/{hospitalName}")
    public Registration updateRegistration(@PathVariable Long hospitalName, @RequestBody Registration updatedRegistration) {
        return registrationRepository.findById(hospitalName)
                .map(registration -> {
                    registration.setHospitalName(updatedRegistration.getHospitalName());
                    registration.setPatient(updatedRegistration.getPatient());
                    return registrationRepository.save(registration);
                })
                .orElse(registrationRepository.save(updatedRegistration));
    }

    
    @DeleteMapping("/{hospitalName}")
    public void deleteRegistration(@PathVariable Long hospitalName) {
        registrationRepository.deleteById(hospitalName);
    }
}
