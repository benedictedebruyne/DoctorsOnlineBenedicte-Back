package be.businesstraining.services;

import be.businesstraining.domain.Doctor;

import java.util.Set;

public interface DoctorsService {

    Set<Doctor> allDoctors();
    Doctor getDoctorById(Long id);
}
