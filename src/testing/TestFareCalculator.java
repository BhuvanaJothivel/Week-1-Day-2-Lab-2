package testing;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
import services.FareCalculator;

public class TestFareCalculator {
	FareCalculator fare = new FareCalculator();

	@Test
	public void testBookHotelMethod() {
		LocalDate ld1 = LocalDate.of(2020, 02, 5);
		LocalDate ld2 = LocalDate.of(2020, 02, 8);
		Hotel hotel1 = new Hotel(1, "ac", 1500, "single", ld1, ld2);
		assertEquals(3375.0, fare.book(hotel1), 0);
		LocalDate ld3 = LocalDate.of(2020, 11, 3);
		LocalDate ld4 = LocalDate.of(2020, 11, 10);
		Hotel hotel2 = new Hotel(1, "nonac", 700, "double", ld3, ld4);
		assertEquals(7350.0, fare.book(hotel2), 0);
		try {
			Hotel h1 = new Hotel(0, "ac", 1500, "single", ld1, ld2);
			Hotel h2 = new Hotel(1, null, 1500, "single", ld1, ld2);
			Hotel h3 = new Hotel(1, "ac", 0, "single", ld1, ld2);
			Hotel h4 = new Hotel(1, "ac", 1500, null, ld1, ld2);
			Hotel h5 = new Hotel(1, "ac", 1500, "single", null, ld2);
			Hotel h6 = new Hotel(1, "ac", 1500, "single", ld1, null);
			fare.book(h1);
			fare.book(h2);
			fare.book(h3);
			fare.book(h4);
			fare.book(h5);
			fare.book(h6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBookBusMethod() {
		LocalDate ld = LocalDate.of(2020, 02, 03);
		Bus bus1 = new Bus(2, 1800, "acsleeper", ld);
		assertEquals(3600, fare.book(bus1));
		Bus bus2 = new Bus(1, 1000, "other", ld);
		assertEquals(1000, fare.book(bus2));
		try {
			Bus b1 = new Bus(0, 1800, "acsleeper", ld);
			Bus b2 = new Bus(1, 0, "acsleeper", ld);
			Bus b3 = new Bus(2, 1800, null, ld);
			Bus b4 = new Bus(1, 1800, "acsleeper", null);
			fare.book(b1);
			fare.book(b2);
			fare.book(b3);
			fare.book(b4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBookFlightMethod() {
		LocalDate ld = LocalDate.of(2020, 02, 03);
		Flight flight1 = new Flight(2, 10000, "economy", ld);
		assertEquals(20000, fare.book(flight1));
		Flight flight2 = new Flight(2, 10000, "executive", ld);
		assertEquals(20000, fare.book(flight2));
		try {
			Flight f1 = new Flight(0, 10000, "economy", ld);
			Flight f2 = new Flight(2, 0, "economy", ld);
			Flight f3 = new Flight(2, 10000, null, ld);
			Flight f4 = new Flight(2, 10000, "economy", null);
			fare.book(f1);
			fare.book(f2);
			fare.book(f3);
			fare.book(f4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBookTrainMethod() {
		LocalDate ld = LocalDate.of(2020, 02, 03);
		Train train1 = new Train(2, 1500, "nonac", ld);
		assertEquals(3000, fare.book(train1));
		Train train2 = new Train(2, 1500, "ac", ld);
		assertEquals(3000, fare.book(train2));
		try {
			Train t1 = new Train(0, 1500, "nonac", ld);
			Train t2 = new Train(2, 0, "nonac", ld);
			Train t3 = new Train(2, 1500, null, ld);
			Train t4 = new Train(2, 1500, "nonac", null);
			fare.book(t1);
			fare.book(t2);
			fare.book(t3);
			fare.book(t4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
