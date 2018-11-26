package com.model;

import java.io.IOException;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;




public class MainApp {


		// TODO Auto-generated method stub
		

		public static void dispMenu() {
			System.out.println("*****Ticket booking System******");
			System.out.println("1. To reserve ticket ");
			System.out.println("2. To display audience  ");
		
		}
		
		
		static Scanner sc=new Scanner(System.in);
		public static void main(String args[]) 
		{

			String ans = "";
			
				Booking bu=new Booking();
				
				do
				{
					dispMenu();
					System.out.println("Enter your choice ");
					int ch =sc.nextInt();
					switch (ch) 
					{
					case 1:
						System.out.println("enter the ticket id");
						int id=sc.nextInt();
						System.out.println("enter the audience name");
						String name=sc.next();
						System.out.println("enter the nationality");
						String nationality=sc.next();
						System.out.println("enter the age");
						int age=sc.nextInt();
						System.out.println("enter the cell no");
						String cellno=sc.next();
						bu.reserveTicket();
						break;
						
					case 2:
						bu.displayAudiences();
						break;
					}
		System.out.println("Do you want to continue yes/no?");
		ans =sc.next();
		} while (ans.equalsIgnoreCase("yes"));

		}	
}