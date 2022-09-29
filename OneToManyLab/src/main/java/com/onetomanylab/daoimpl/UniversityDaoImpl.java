package com.onetomanylab.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.onetomanylab.config.HibernateUtil;
import com.onetomanylab.dao.UniversityDao;
import com.onetomanylab.entity.University;
import com.onetomanylab.entity.University_Students;


public class UniversityDaoImpl implements UniversityDao
{

	
	
	@Override
	public void addDetails() 
	{
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	    Transaction t = session.beginTransaction();
		//   University object created
		University u = new University();
        //   adding details using setter by the help of University object
        u.setUniversityName("unknown university");
        u.setUniversityAddress("Trying to find");
        u.setUniversityHead("Unknown person");
        u.setUniversityEmail("university@email.com");
        //   adding details using setter by the help of University_Students object for University_Students 1
        University_Students us = new University_Students();
        us.setStudentName("Daku");
        us.setStudentDept("eee");
        us.setStudentPhone(7896541);
        us.setStudEmail("daku@email");
        //   adding details using setter by the help of University_Students object for University_Students 2
        University_Students us2 = new University_Students();
        us2.setStudentName("Saikat");
        us2.setStudentDept("eee");
        us2.setStudentPhone(7892541);
        us2.setStudEmail("saikat@email");
        //   adding details using setter by the help of University_Students object for University_Students 3
        University_Students us3 = new University_Students();
        us3.setStudentName("Mandi");
        us3.setStudentDept("eee");
        us3.setStudentPhone(1112541);
        us3.setStudEmail("mandi@email.com");
        //   adding into University_Students list
        ArrayList<University_Students> s = new ArrayList<University_Students>();
        s.add(us);
        s.add(us2);
        s.add(us3);
        //   adding University_Students into University table
        u.setUniversity_student(s);
        //   saving into db
        session.save(u);
        //   saving into db permanently
        t.commit();
        
        System.out.println("----------INSERTED SUCCESSFULLY----------");
		
	}

	@Override
	public void fetchDetails() 
	{
		Session session1 = HibernateUtil.getSessionFactory().openSession();
	    
		//  creating query
		Query q = session1.createQuery("from University_Student");
        List<University_Students> us7 = q.getResultList();
        //  iterating University_Students list
        Iterator<University_Students> itr = us7.iterator();
        while (itr.hasNext())
        {
            University u9 = new University();
            University_Students p = new University_Students();
            //   displaying the details
            System.out.println(u9.getUniversityId()+"  "+u9.getUniversityName()+"  "+u9.getUniversityEmail());
            System.out.println(p.getStudentId()+"  "+p.getStudentName()+"  "+p.getStudentDept());
        }
		
	}
	
	

}
