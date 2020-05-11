package com.test.multithread;

/**
 * @author shanmugam
 *
 */
public class BusTicketMain {

	public static void main(String args[]) {
		BusTicketReservation b1 = new BusTicketReservation("Mr A");
		BusTicketReservation b2 = new BusTicketReservation("Mr B");
		BusTicketReservation b3 = new BusTicketReservation("Mr C");
		BusTicketReservation b4 = new BusTicketReservation("Mr D");
		BusTicketReservation b5 = new BusTicketReservation("Mr E");
		BusTicketReservation b6 = new BusTicketReservation("Mr F");
		BusTicketReservation b7 = new BusTicketReservation("Mr G");
		BusTicketReservation b8 = new BusTicketReservation("Mr H");
		BusTicketReservation b9 = new BusTicketReservation("Mr I");
		BusTicketReservation b10 = new BusTicketReservation("Mr J");
		BusTicketReservation b11 = new BusTicketReservation("Mr Extra");

		b1.t.start();
		b2.t.start();
		b3.t.start();
		b4.t.start();
		b5.t.start();
		b6.t.start();
		b7.t.start();
		b8.t.start();
		b9.t.start();
		b10.t.start();
		b11.t.start();
		try {
			b1.t.join();
			b2.t.join();
			b3.t.join();
			b4.t.join();
			b5.t.join();
			b6.t.join();
			b7.t.join();
			b8.t.join();
			b9.t.join();
			b10.t.join();
			b11.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x = BusTicketBookingUtility.ticketNumber;
		
		if (x < 0)
			x = 0;

		System.out.println(BusTicketBookingUtility.msg);
		System.out.println("currently availble ticket ------>" + x);
		System.out.println("=========Reserved for =======");
		BusTicketBookingUtility.set.stream().forEach((n) -> System.out.println(n));
		System.out.println("=========End =======");
	}

}
