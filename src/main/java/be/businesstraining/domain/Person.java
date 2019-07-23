//package be.businesstraining.doctorsonlinebeneback.domain;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Persons")
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//public class Person {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String lastName;
//    private String firstName;
//    private String email;
//    private String gsmNumber;
//
//    @OneToOne //(mappedBy = "doctor", fetch = FetchType.LAZY)
//    private Doctor doctor;
//
//}
//
