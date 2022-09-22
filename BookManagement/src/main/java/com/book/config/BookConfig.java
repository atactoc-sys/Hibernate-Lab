package com.book.config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookConfig 
{
private static SessionFactory sessionFactory;
	
	static
	{
		try 
		{
			
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}
		catch (HibernateException e)
		{
			System.out.println(e);

		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		
		return sessionFactory;
		
	}
}
