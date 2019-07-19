package be.businesstraining.doctorsonlinebeneback.services;

import be.businesstraining.doctorsonlinebeneback.domain.Doctor;

import java.util.Set;

public interface DoctorsService {

    Set<Doctor> allDoctors();
    Doctor getDoctorById(Long id);
}
