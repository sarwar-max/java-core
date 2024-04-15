package com;

import java.util.List;

public interface PassengerDao {

	Passenger getPassengerById(int id);

	List<Passenger> getAllPassengers();

	void addPassenger(Passenger passenger);

	void updatePassenger(Passenger passenger);

	void deletePassenger(int id);
}
