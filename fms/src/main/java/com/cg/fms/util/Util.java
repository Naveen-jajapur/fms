package com.cg.fms.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.fms.bean.Airport;
import com.cg.fms.bean.Flight;
import com.cg.fms.flightexception.FlightException;

public class Util {
	static  List<Flight> flightList=new ArrayList<Flight>();
	static List<Airport> sourceList=new ArrayList<Airport>();
	static List<Airport> destList=new ArrayList<Airport>();
	
	
	
	static {
		
		Flight f1= new Flight(1001,"BUSSINESS","INS",100);
		Flight f2= new Flight(1002,"ECONOMY","INS",80);
		Flight f3= new Flight(1003,"FIRSTCLASS","INS",50);
		
		Airport s1= new Airport("Rajiv Gandhi International Airport","HYD","Hyderabad");
		Airport s2= new Airport("chathrapathi Shivaji International Airport","MUM","Mumbai");
		Airport s3= new Airport("Kempoguda Airport","BEN","Bengaluru");
		
		Airport d1= new Airport("Rajiv Gandhi International Airport","HYD","Hyderabad");
		Airport d2= new Airport("chathrapathi Shivaji International Airport","MUM","Mumbai");
		Airport d3= new Airport("Kempoguda Airport","BEN","Bengaluru");
		
		flightList.add(f1);
		flightList.add(f2);
		flightList.add(f3);
		
		sourceList.add(s1);
		sourceList.add(s2);
		sourceList.add(s3);

		destList.add(d1);
		destList.add(d2);
		destList.add(d3);

	}
	
	public static Flight  searchSourceFlight(int id)throws FlightException
	{
		Flight f=null;
		if(flightList.stream().anyMatch(p->p.getFlightNumber()==id))
		{
		  f =flightList.stream().filter(p->p.getFlightNumber()==id).findFirst().get();
		}	
			
		else
		{
		throw new FlightException(id+""+" Flight number does not exists");
		}	
			
		  return f ;
	}
	public static Airport  searchSourceAirport(String sourcecode) throws FlightException
	{

	Airport a =null;
	if(sourceList.stream().anyMatch(p->p.getAirportCode().equals(sourcecode))) {
		 a =sourceList.stream().filter(p->p.getAirportCode().equals(sourcecode)).findFirst().get();
		
	}
	else
		throw new FlightException(" Airport does not exists");
	  return a;
	}
	public static Airport  searchDestAirport(String destcode) throws FlightException
	{

	Airport a =null;
	if(sourceList.stream().anyMatch(p->p.getAirportCode().equals(destcode))) {
		 a =sourceList.stream().filter(p->p.getAirportCode().equals(destcode)).findFirst().get();
		
	}
	else
		throw new FlightException(" Airport does not exists");
		
		  return a;
	}
}
