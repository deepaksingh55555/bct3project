package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking implements Contract{
	
	int ticket;
	int ticketprice;
	public static List<Ticket> ticketList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	@Override
	public void reserveTicket() {
		System.out.println("enter the ticket");
		ticket=sc.nextInt();
		
		if(ticket<=100){
			System.out.println("enter the ticket price");
			ticketprice=sc.nextInt();
			if(ticketprice==500){
				System.out.println("ticket booked for indian citizen");
			}
			if(ticketprice==1000){
				System.out.println("ticket booked for foreign citizen");
			} else
				try {
					throw new ReserveException("ticket is no more");
				} catch (ReserveException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAudiences() {
		
			for(Ticket u:ticketList)
			{
				System.out.println(u);
			}
		// TODO Auto-generated method stub
		
	}

}
