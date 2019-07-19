package be.businesstraining.doctorsonlinebeneback.rest;

import be.businesstraining.doctorsonlinebeneback.domain.Doctor;
import be.businesstraining.doctorsonlinebeneback.services.DoctorsService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/doctors")
@CrossOrigin
public class DoctorsResource {

    private DoctorsService service;

    public DoctorsResource(DoctorsService service) {
        this.service = service;
    }

    @GetMapping
    public Set<Doctor> allDoctors(){
        return service.allDoctors();
    };

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        return service.getDoctorById(id);
    };
}
