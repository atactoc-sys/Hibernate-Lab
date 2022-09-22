package com.book;



import java.util.Scanner;

import com.book.doaImpl.BookDoaImpl;


public class App 
{
    public static void main( String[] args )
    {
    	BookDoaImpl booikDoaImplobj = new BookDoaImpl();
    	@SuppressWarnings("resource")
		Scanner scannerObj4 = new Scanner(System.in);
    
    	char u;
    	do {
			
    		System.out.println("_____________________________________________________");
			System.out.println("PRESS 1 TO ADD BOOK\nPRESS 2 TO FETCH BOOK DETAILS\nPRESS 3 TO EXIT");
        	System.out.println("_____________________________________________________");
    		
        	int i = scannerObj4.nextInt();
        	
        	switch (i) {
			case 1:
				booikDoaImplobj.addBook();
				break;
			case 2:
				booikDoaImplobj.fetchBook();
				break;
			case 3: 
				System.exit(0);

			default:
				System.out.println("UPS.. WRONG INPUT");
				break;
			}
        	System.out.println("Do you want to continue in main menu (Y / N)");
        	u = scannerObj4.next().charAt(0);
        	
    		
		} while (u == 'y' || u == 'Y');
    	System.out.println("thank-you...");
    }
    
}
