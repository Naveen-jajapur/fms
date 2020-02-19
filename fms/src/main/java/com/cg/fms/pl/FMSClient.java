package com.cg.fms.pl;

import java.util.Scanner;

import com.cg.fms.bean.Airport;
import com.cg.fms.bean.Flight;
import com.cg.fms.bean.Schedule;
import com.cg.fms.bean.ScheduledFlight;
import com.cg.fms.service.ScheduleFlightServicesImpl;

public class FMSClient {

	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		ScheduleFlightServicesImpl service= new ScheduleFlightServicesImpl();
		Flight flight=null;
		Airport air = null;
		Schedule sch = null;
		ScheduledFlight schflight=null;
		int choice =0;
		while(choice!=5) {
			System.out.println(" 1. ScheduledFlight ");
			System.out.println(" 2. View list of ScheduledFlights ");
			System.out.println(" 3. Modify a  ScheduledFlight ");
			System.out.println(" 4. Delete a ScheduledFlight ");
			System.out.println(" 5 .exit ");
			System.out.println(" Enter your choice ");
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println(" Enter your Source Airport from the given List ");
				System.out.println(" 1. Hyderabad 2. Bengaluru 3.Delhi 4. Mumbai 5. Coimbatore ");
				String source = sc.nextLine();
				System.out.println(" Enter your destination Airport from the given List ");
				System.out.println(" 1. Hyderabad 2. Bengaluru 3.Delhi 4. Mumbai 5. Coimbatore ");
				String destination = sc.nextLine();
			    System.out.println("Enter your Arrival date and time ");
			    String arrival = sc.next();
			    System.out.println("Enter your departure date and time");
			    String departure = sc.next();
			    Schedule s = null;
			    
			    
			case 2 : 
				System.out.println("");
			    
			    
			
			}
			
		}
		
		
	}

}
