
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class ProductOperationsDB {

	private Connection con = null;
	private PreparedStatement preparedStatement = null;
	private static ProductOperationsDB productOperationsDB = new ProductOperationsDB();
	
	
	private ProductOperationsDB() {
		
		String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_name + "?useUnicode=true&characterEncoding=utf8&useSSL=false";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			
			System.out.println("Driver couldn't find...");
		}
		
		try {
			
			con = DriverManager.getConnection(url, Database.username, Database.password);
			System.out.println("Connection succesful...");
		}
		catch(SQLException e) {
			
			System.out.println("Connection failed...");
		}
	}
	
	public static ProductOperationsDB getProductOperationsDB() {
		
		return productOperationsDB;
	}
	
	public void addAdmin(String username, String password, String email) {
		
		String query = "INSERT INTO Account (username, password, email) VALUES (?, ?, ?)";
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, email);
			
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public boolean login(String username, String password) {
		
		String query = "SELECT * FROM Account WHERE username = ? AND password = ?";
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			return rs.next();
		}catch(SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}
	
	public void addChecks(String table_name, String contains, double price) {
		
		String query = "INSERT INTO Checks (table_name, contains, price) VALUES (?, ?, ?)";
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, table_name);
			preparedStatement.setString(2, contains);
			preparedStatement.setDouble(3, price);
			
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getContains(String table_name) {
		
		String query = "SELECT * FROM Checks WHERE table_name = ?";
		ArrayList<String> contains = new ArrayList<String>();
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, table_name);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				contains.add(rs.getString("contains"));
			}	
			
			return contains;
			
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	public double getTotalPrice(String table_name) {
		
		String query = "SELECT * FROM Checks WHERE table_name = ?";
		double price = 0.0;
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, table_name);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				price += rs.getDouble(4);
			}
			
			return price;
		}catch (SQLException e) {
			
			e.printStackTrace();
			return 0.0;
		}
	}
	
	public void deleteCheck(String table_name) {
		
		String query = "DELETE FROM Checks WHERE table_name = ?";
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, table_name);
			
			preparedStatement.execute();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public ListModel<Object> updateJList(String table_name) {
		
		String query = "SELECT * FROM Checks WHERE table_name = ?";
		
		try {
			
			DefaultListModel<Object> model = new DefaultListModel<Object>();
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, table_name);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			
			while(rs.next()) {
				
				String contains = rs.getString("table_name") + " " + rs.getString("contains") + " " + rs.getDouble("price") + " TL";
				model.addElement(contains);
			}
			
			return model;
		}
		catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean isFull(String table_name) {
		
		String query = "SELECT * FROM Checks WHERE table_name = ?";
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, table_name);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				
				return true;
			}
			return false;
		}catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}
}
