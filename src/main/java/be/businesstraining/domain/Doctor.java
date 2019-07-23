//package be.businesstraining.doctorsonlinebeneback.domain;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Doctors")
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//public class Doctor extends Person{
//
//    @Column(length = 1000)
//    private String photo;
//    private String speciality;
//
//}

package be.businesstraining.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Doctors")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String email;
    private String gsmNumber;
    @Column(length = 1000)
    private String photo;
    private String speciality;

}


