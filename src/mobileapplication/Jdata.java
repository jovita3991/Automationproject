package mobileapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdata {
	public static void main(String args[]) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		String password = "juhidas";
		String query = "select name from student where Studentid=3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("Name");
		
		System.out.println(name);
		
		st.close();
		con.close();
	}

}


