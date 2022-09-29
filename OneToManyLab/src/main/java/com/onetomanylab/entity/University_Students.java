package com.onetomanylab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class University_Students 
{
	
	@Id  //   primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;

    @Column(length = 30, nullable = false)
    private String studentName;

    @Column(length = 30, nullable = false)
    private String studentDept;

    @Column(length = 30, nullable = false)
    private long studentPhone;

    @Column(length = 30, nullable = false)
    private String studEmail;

   
}
