package jdbc;

import java.sql.Connection;

public class Insert {
	public void insert() {
		try {
			Connection con = new Database().loading();
			java.sql.Statement stmt = con.createStatement();
			
			
			((java.sql.Statement) stmt).executeUpdate("INSERT INTO actor " + 
	                "VALUES (1222, 'suvu', 'bar', '2020-09-08 16:16:16')");
			System.out.println("Data inserted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
