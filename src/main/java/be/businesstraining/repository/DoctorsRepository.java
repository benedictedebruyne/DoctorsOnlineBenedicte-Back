package be.businesstraining.repository;

import be.businesstraining.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepository extends JpaRepository<Doctor, Long> {

}
