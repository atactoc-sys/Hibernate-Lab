package com.book.doaImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.config.BookConfig;
import com.book.doa.BookDoa;
import com.book.dto.BookDto;
import com.book.entity.Book;

public class BookDoaImpl implements BookDoa
{
	Scanner sc = new Scanner(System.in);
	@Override
	public void addBook() 
	{
		
		
		String bn,ban,bt;
		double p;
		
		System.out.println("please enter book name");
		bn = sc.next();
		
		System.out.println("please enter book author name");
		ban = sc.next();
		
		System.out.println("please enter book type");
		bt = sc.next();
		
		System.out.println("please enter book price");
		p = sc.nextDouble();
		
		BookDto bookDto = new BookDto();
		
		bookDto.setBookName(bn);
		bookDto.setBookAuthor(ban);
		bookDto.setBookType(bt);
		bookDto.setBookPrice(p);
		Book book = new Book();
		book.setBookName(bookDto.getBookName());
		book.setBookAuthor(bookDto.getBookAuthor());
		book.setBookType(bookDto.getBookType());
		book.setBookPrice(bookDto.getBookPrice());
		
		Session session = BookConfig.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(book);
		System.out.println("data saved successfully...");
		tr.commit();
		
	}

	@Override
	public void fetchBook() {
		String bnm;
		System.out.println("enter the book name");
		bnm = sc.next();
		Session session = BookConfig.getSessionFactory().openSession();
		Book bookDto1 = session.get(Book.class, bnm);
		System.out.println(bookDto1.getBookNumber());
		System.out.println(bookDto1.getBookName());
		System.out.println(bookDto1.getBookAuthor());
		System.out.println(bookDto1.getBookType());
		System.out.println(bookDto1.getBookPrice());
		
	}



}
