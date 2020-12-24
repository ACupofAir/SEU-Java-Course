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

		String connectionurl = "jdbc:mysql://127.0.0.1:3306/MyDB"+
		"?user=root&password=123456";
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
			pst.setString(1, "San Francisco");
			pst.setInt(2, 2000);
			pst.setString(3, "2001-01-09");
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
			System.out.println();

			while (rs.next()) {
				System.out.println(rs.getString("store_name"));
				System.out.println(rs.getFloat("Sales"));
				System.out.println(rs.getString("Date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
