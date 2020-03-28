package com.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample {

	public static void main(String[] args) {
		// register
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//getting connection
			Connection conn=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		    //create statement
			Statement stmt=conn.createStatement();
		    //call method
			//String query="insert into depart values(50,'pk','hyd')";
			//String query="update depart set loc='delhi' where dno=50";
			//String query="delete from depart where dno=20";
			String query="select * from depart";
			ResultSet resultset=stmt.executeQuery(query);
			while (resultset.next()) {
				System.out.println(resultset.getInt(1)+"  "+resultset.getString("dname")+"   "+resultset.getString(3));
				//System.out.println();
				//System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
