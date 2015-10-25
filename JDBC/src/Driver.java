import java.sql.*;


public class Driver {
	
	public static void main(String[] args){
		
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "hangxom";
		System.out.println("Connecting ...");
		try{
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection(url, username, password);
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			//3. Excute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from user");
			//4. Process the result set
			while (myRs.next()){
				System.out.println(myRs.getString("name") + ", " + myRs.getString("email"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("What is up");
	}
	
}