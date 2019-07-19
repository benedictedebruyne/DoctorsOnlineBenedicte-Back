package be.businesstraining.doctorsonlinebeneback.repository;

import be.businesstraining.doctorsonlinebeneback.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepository extends JpaRepository<Doctor, Long> {

}
