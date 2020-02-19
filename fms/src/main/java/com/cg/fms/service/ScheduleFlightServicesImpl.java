package com.cg.fms.service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.cg.fms.bean.Airport;
import com.cg.fms.bean.DateTime;
import com.cg.fms.bean.Flight;
import com.cg.fms.bean.Schedule;
import com.cg.fms.bean.ScheduledFlight;
import com.cg.fms.dao.ScheduledFlightDaoImpl;
import com.cg.fms.flightexception.FlightException;

public class ScheduleFlightServicesImpl implements  ScheduleFlightServices{
	
	private ScheduledFlightDaoImpl daoimpl ;
			
	public ScheduleFlightServicesImpl() {
		daoimpl=new ScheduledFlightDaoImpl();
	}
	Map<Integer,ScheduledFlight> schedflight = new HashMap<Integer,ScheduledFlight>();
	@Override
	public int scheduleFlight(ScheduledFlight scheduleFlight) throws FlightException{
		String str= String.valueOf(scheduleFlight.getFlight().getFlightNumber());
		if(!str.matches("[0-9]{4}"))
				{
			throw new FlightException("Flight number should be 4 digits");
				}
		
		return daoimpl.scheduleFlight(scheduleFlight);
	}

//	@Override
//	public List<ScheduledFlight> viewScheduledFlights(Airport source, Airport destination, DateTime date)  throws FlightException{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Flight viewScheduledFlights(BigInteger flightNumber) throws FlightException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<ScheduledFlight> viewScheduledFlight() throws FlightException {
		
		return daoimpl.viewScheduledFlight();
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, int a)  throws FlightException{
		String str= String.valueOf(flight.getFlightNumber());
		String str1= flight.getCarrierName();
		
		if(!str.matches("[0-9]{4}")&&(str1.matches("[A-Z}{3}")))
				{
			throw new FlightException("Flight number should be 4 digits and Flight carrier name should contain only 3 characters");
				}
		return daoimpl.modifyScheduledFlight(flight, schedule,a);
	}

	@Override
	public void deleteScheduledFlight(int flightNumber) throws FlightException {
		String str= String.valueOf(flightNumber);
		if(!str.matches("[0-9]{4}"))
				{
			throw new FlightException("Flight number should be 4 digits");
				}
		daoimpl.deleteScheduledFlight(flightNumber);
	}

	@Override
	public void validateScheduledFlight(ScheduledFlight scheduledflight) throws FlightException {
		// TODO Auto-generated method stub
		
	}

}
