package com.test.multithread;

/**
 * @author shanmugam
 *
 */
import java.util.HashSet;

public class BusTicketBookingUtility {

	public static int ticketNumber = 10;
	public static HashSet<String> set = new HashSet<>();
	public static String msg = "";
//	boolean setFlag = true;
	
	public BusTicketBookingUtility() {
		// TODO Auto-generated constructor stub
	}

	public  synchronized void bookTickets(String userName) {

		ticketNumber--;

		if (ticketNumber <= 0)
			msg = "No Seats availble " + userName;
		else
			registerName(userName);
	}

	public  synchronized void registerName(String usrName) {
		set.add(usrName);

	}

}
