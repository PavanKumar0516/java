package com.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ModelDAO {
  
	public int addUser(User bean) {
		int count=0;
		Connection conn=DBUtil.getDBConnection();
		String insert="insert into account values(?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setString(1, bean.getUname());
			
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getDate());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
		
}
