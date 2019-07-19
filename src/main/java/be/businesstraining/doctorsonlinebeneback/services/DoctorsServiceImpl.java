package be.businesstraining.doctorsonlinebeneback.services;

import be.businesstraining.doctorsonlinebeneback.domain.Doctor;
import be.businesstraining.doctorsonlinebeneback.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DoctorsServiceImpl implements DoctorsService {

    @Autowired
    private DoctorsRepository repository;

    @Override
    public Set<Doctor> allDoctors() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
