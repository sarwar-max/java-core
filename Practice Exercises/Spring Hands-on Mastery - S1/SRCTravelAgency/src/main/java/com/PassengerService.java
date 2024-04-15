package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PassengerService {

	private final PassengerDao passengerDao;

	@Autowired
	public PassengerService(PassengerDao passengerDao) {
		this.passengerDao = passengerDao;
	}

	@Transactional
	public void createPassenger(Passenger passenger) {
		passengerDao.addPassenger(passenger);
	}

	@Transactional(readOnly = true)
	public Passenger getPassengerById(int passengerId) {
		return passengerDao.getPassengerById(passengerId);
	}

	@Transactional(readOnly = true)
	public List<Passenger> getAllPassengers() {
		return passengerDao.getAllPassengers();
	}

	@Transactional
	public void updatePassenger(Passenger passenger) {
		passengerDao.updatePassenger(passenger);
	}

	@Transactional
	public void deletePassenger(int passengerId) {
		passengerDao.deletePassenger(passengerId);
	}
}
