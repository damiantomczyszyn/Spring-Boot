package com.damiantomczyszyn.studentmanager.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;




  /*  @Nullable
    private Integer age;
    @Nullable
    private String lastName;
    @Nullable
    private String email;
    @Nullable
    private String phoneNumber;

   */

}
