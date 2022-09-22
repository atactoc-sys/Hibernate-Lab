package com.book.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookNumber;
	@Column(length = 40, nullable = false)
	@NotNull(message = "PLEASE ENTER THE NAME OF THE BOOK")
	private String bookName;
	@Column(length = 25, nullable = false,unique = true)
	@NotNull(message = "PLEASE ENTER THE AUTHOR NAME OF THE BOOK")
	private String bookAuthor;
	@Column(length = 25, nullable = false)
	@NotNull(message = "PLEASE ENTER THE TYPE OF THE BOOK")
	private String bookType;
	@Column(length = 25, nullable = false)
	@NotNull(message = "PLEASE ENTER THE PRICE OF THE BOOK")
	private double bookPrice;
}
