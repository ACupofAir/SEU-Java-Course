package chapter10_JDBC.Homework;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {



	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


		String connectionurl = "jdbc:mysql://127.0.0.1:3306/bookstore?"+
		"user=root&password=123456&&useSSL=false";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionurl);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String insertString = "INSERT INTO bookstore (store_name,"+
				"Sales,Date) values (?,?,?)";
		String selectString = "SELECT * FROM bookstore";
		Statement statement = null;
		PreparedStatement pst = null;
		try {
			statement = connection.createStatement();
			pst = connection.prepareStatement(insertString);
			pst.setString(1, "Los Angeles");
			pst.setInt(2, 1500);
			pst.setString(3, "1999-01-09");
			pst.addBatch();
			pst.clearParameters();
			pst.executeBatch();

			pst = connection.prepareStatement(insertString);
			pst.setString(1, "San Francisco");
			pst.setInt(2, 250);
			pst.setString(3, "1999-01-07");
			pst.addBatch();
			pst.clearParameters();
			pst.executeBatch();

			pst = connection.prepareStatement(insertString);
			pst.setString(1, "Los Angeles");
			pst.setInt(2, 300);
			pst.setString(3, "1999-01-08");
			pst.addBatch();
			pst.clearParameters();
			pst.executeBatch();

			pst = connection.prepareStatement(insertString);
			pst.setString(1, "Boston\t");
			pst.setInt(2, 700);
			pst.setString(3, "1999-01-08");
			pst.addBatch();
			pst.clearParameters();
			pst.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs = null;
		try {
			rs = statement.executeQuery(selectString);
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n----------------------------");

			while (rs.next()) {
				System.out.println(rs.getString("store_name") + "\t" + rs.getInt("Sales") + "\t" + rs.getString("Date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
