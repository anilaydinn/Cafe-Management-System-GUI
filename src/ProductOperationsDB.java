import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductOperationsDB {

	private Connection con = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	public ProductOperationsDB() {
		
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
	
	public void addChecks(String contains, String responsible, double price, String paymentMethod) {
		
		String query = "INSERT INTO Checks (contains, responsible, price, payment_method) VALUES (?, ?, ?, ?)";
		
		try {
			
			preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, contains);
			preparedStatement.setString(2, responsible);
			preparedStatement.setDouble(3, price);
			preparedStatement.setString(4, paymentMethod);
			
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
