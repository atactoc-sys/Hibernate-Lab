package com.onetomanylab;

import com.onetomanylab.daoimpl.UniversityDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        UniversityDaoImpl obj = new UniversityDaoImpl();
       // obj.addDetails();  //   calling addDetails()
        obj.fetchDetails();  //   calling obj.fetchDetails()
    }
}
