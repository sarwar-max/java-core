package com;

import java.util.List;

public interface PassengerDao {

	PassengerDetails getPassengerById(int id);

	List<PassengerDetails> getAllPassengers();

	void addPassenger(PassengerDetails passenger);

	void updatePassenger(PassengerDetails passenger);

	void deletePassenger(int id);
}
