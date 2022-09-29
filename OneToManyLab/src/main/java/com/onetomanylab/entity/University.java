package com.onetomanylab.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@NoArgsConstructor
@Entity

public class University 
{
	
	@Id  //   primary key
	@GeneratedValue(strategy = GenerationType.AUTO)  //  auto incrementes
    private int universityId;

    @Column(length = 30, nullable = false)
    private String universityName;

    @Column(length = 30, nullable = false)
    private String universityHead;

    @Column(length = 30, nullable = false)
    private String universityAddress;

    @Column(length = 30, nullable = false)
    private String universityEmail;


    @OneToMany(cascade = CascadeType.ALL)  //   aggregation
    @JoinColumn(name = "universityId")  //   join by universityId
    private List<University_Students> university_student;

}
