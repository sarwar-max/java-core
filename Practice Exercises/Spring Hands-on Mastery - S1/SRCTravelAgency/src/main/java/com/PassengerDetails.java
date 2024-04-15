package com;

import java.time.LocalDate;

public class PassengerDetails {

	private int passengerId;
	private String passengerName;
	private LocalDate passengerDob;
	private String passengerPhone;
	private String passengerEmail;

	public PassengerDetails() {
		// Default constructor
	}

	public PassengerDetails(int passengerId, String passengerName, LocalDate passengerDob, String passengerPhone,
			String passengerEmail) {
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerDob = passengerDob;
		this.passengerPhone = passengerPhone;
		this.passengerEmail = passengerEmail;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public LocalDate getPassengerDob() {
		return passengerDob;
	}

	public void setPassengerDob(LocalDate passengerDob) {
		this.passengerDob = passengerDob;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	@Override
	public String toString() {
		return "Passenger{" + "passengerId=" + passengerId + ", passengerName='" + passengerName + '\''
				+ ", passengerDob=" + passengerDob + ", passengerPhone='" + passengerPhone + '\'' + ", passengerEmail='"
				+ passengerEmail + '\'' + '}';
	}
}
