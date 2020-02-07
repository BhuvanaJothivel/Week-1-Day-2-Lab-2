package model;

import java.time.LocalDate;

import services.Booking;

public class Flight extends Booking {

	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate date;

	public Flight(int noOfPersons, int rates, String busType, LocalDate date) {

		this.noOfPersons = noOfPersons;
		this.rates = rates;
		this.classType = busType;
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

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

}
