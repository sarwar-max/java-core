package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PassengerDetails getPassengerById(int id) {
		String sql = "SELECT * FROM Passenger_Details WHERE Passenger_id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new PassengerRowMapper());
	}

	@Override
	public List<PassengerDetails> getAllPassengers() {
		String sql = "SELECT * FROM Passenger_Details";
		return jdbcTemplate.query(sql, new PassengerRowMapper());
	}

	@Override
	public void addPassenger(PassengerDetails passenger) {
		String sql = "INSERT INTO Passenger_Details (Passenger_id, Passenger_name, Passenger_dob, Passenger_phone, Passenger_email) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, passenger.getPassengerId(), passenger.getPassengerName(), passenger.getPassengerDob(),
				passenger.getPassengerPhone(), passenger.getPassengerEmail());
	}

	@Override
	public void updatePassenger(PassengerDetails passenger) {
		String sql = "UPDATE Passenger_Details SET Passenger_name = ?, Passenger_dob = ?, Passenger_phone = ?, Passenger_email = ? WHERE Passenger_id = ?";
		jdbcTemplate.update(sql, passenger.getPassengerName(), passenger.getPassengerDob(),
				passenger.getPassengerPhone(), passenger.getPassengerEmail(), passenger.getPassengerId());
	}

	@Override
	public void deletePassenger(int id) {
		String sql = "DELETE FROM Passenger_Details WHERE Passenger_id = ?";
		jdbcTemplate.update(sql, id);
	}

	private static class PassengerRowMapper implements RowMapper<PassengerDetails> {
		@Override
		public PassengerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			PassengerDetails passenger = new PassengerDetails();
			passenger.setPassengerId(rs.getInt("Passenger_id"));
			passenger.setPassengerName(rs.getString("Passenger_name"));
			passenger.setPassengerDob(rs.getDate("Passenger_dob").toLocalDate());
			passenger.setPassengerPhone(rs.getString("Passenger_phone"));
			passenger.setPassengerEmail(rs.getString("Passenger_email"));
			return passenger;
		}
	}
}
