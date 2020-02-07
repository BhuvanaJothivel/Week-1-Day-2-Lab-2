package model;

import java.time.LocalDate;

import services.Booking;

public class Bus extends Booking {

	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;

	public Bus(int noOfPersons, int rates, String busType, LocalDate date) {

		this.noOfPersons = noOfPersons;
		this.rates = rates;
		this.busType = busType;
		this.date = date;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

}
