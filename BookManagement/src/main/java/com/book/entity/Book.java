package com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BOOKSHELF")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookNumber;
	@Column(length = 40, nullable = false)
	private String bookName;
	@Column(length = 25, nullable = false,unique = true)
	private String bookAuthor;
	@Column(length = 25, nullable = false)
	private String bookType;
	@Column(length = 25, nullable = false)
	private double bookPrice;
	
}
