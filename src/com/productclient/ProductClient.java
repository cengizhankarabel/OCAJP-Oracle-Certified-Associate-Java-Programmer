package com.productclient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class ProductClient {

	public static void main(String[] args) throws Exception {
		
		try (Connection con = getConnection();
				Statement statement = con.createStatement();
				ResultSet rs = statement.executeQuery("SELECT * FROM Customer");)
			{
				if (rs.next()) rs.getString(2);    // line 1
			}
			catch (SQLException e) {
				System.out.println(e);
			}
	}
}
