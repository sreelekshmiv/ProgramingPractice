package com.innovapath.programingpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static Connection getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle JDBC Driver not found!");
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager
					.getConnection(
							"jdbc:oracle:thin:@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:orcl",
							"hr", "hr123");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("Connected!!!");
		} else {
			System.out.println("Connection failed!!!");
		}
		return connection;
	}

	// Selects Records from Table
	public static void selectRecords(Connection dbConnection)
			throws SQLException {

		Statement statement = null;
		String selectTableSQL = "SELECT FRISTNAME,LASTNAME FROM EMPLOYEE";

		try {
			statement = dbConnection.createStatement();
			System.out.println(selectTableSQL);
			// execute select SQL stetement
			ResultSet rs = statement.executeQuery(selectTableSQL);

			while (rs.next()) {

				String userid = rs.getString("FRISTNAME");
				String username = rs.getString("LASTNAME");

				System.out.println("userid : " + userid);
				System.out.println("username : " + username);

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {

			if (statement != null) {
				statement.close();
			}
		}
		
	}

	//Insert Record 
	public static void inertRecords(Connection dbConnection) throws SQLException {

		Statement statement = null;

		String insertTableSQL = "INSERT INTO EMPLOYEE"
				+ "(FRISTNAME, LASTNAME) " + "VALUES"
				+ "('eclfirstname','ecllastname')";
		try {
			statement = dbConnection.createStatement();

			System.out.println(insertTableSQL);

			// execute insert SQL stetement
			statement.executeUpdate(insertTableSQL);

			System.out.println("Record is inserted into Employee table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
		finally {

			if (statement != null) {
				statement.close();
			}
		}
	}

	//Update record
	public static void updateRecord(Connection dbConnection) throws SQLException
	{
		Statement statement = null;

		String updateTableSQL = "UPDATE Employee"
				+ " SET FRISTNAME = 'Eclipse' "
				+ " WHERE LASTNAME = 'ecllastname'";

		try {
			
			statement = dbConnection.createStatement();

			System.out.println(updateTableSQL);

			// execute update SQL stetement
			statement.execute(updateTableSQL);

			System.out.println("Record is updated to Employee table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}
		}

	}
	public static void main(String args[]) throws SQLException {
		Connection dbConnection = null;
		dbConnection = getConnection();

		try {
			JDBC.selectRecords(dbConnection);
			JDBC.inertRecords(dbConnection);
			JDBC.updateRecord(dbConnection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (dbConnection != null) {
				dbConnection.close();
			}

		}
	}
}
