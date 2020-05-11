package com.test.multithread;

/**
 * @author shanmugam
 *
 */
public class BusTicketReservation implements Runnable {
	
	Thread t;
	BusTicketBookingUtility utility;
	
	
	public BusTicketReservation(String userName) {
		// TODO Auto-generated constructor stub
		t= new Thread(this, userName);
		utility= new BusTicketBookingUtility();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		utility.bookTickets(t.getName());
	}
	
	
	        

}
