package com.example.dao;

import java.sql.Connection;
import java.sql.*;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.pojo.Assistant;

@Repository
public class AssistantDaoImpl implements AssistantDao {
	Connection conn;

	public AssistantDaoImpl(){
		String myDriver = "com.mysql.jdbc.Driver";
		String myUrl = "jdbc:mysql://localhost/test";
		try
		{
		Class.forName(myDriver);
		conn = DriverManager.getConnection(myUrl, "root", "root");
		}
		catch(Exception e)
		{
			System.err.println("Got an exception!");
		    System.err.println(e.getMessage());
		}
	}
	public void finalize(){
		try
		{
		conn.close();
		}
		catch(Exception e)
		{
			System.err.println("Got an exception!");
		    System.err.println(e.getMessage());
		}
	}
	
	@Override
	public int addAssistant(Assistant assistant) {
		try
	    {
	      // create a mysql database connection
	      

	      // the mysql insert statement
	      String query = " insert into Assistants Values(?,?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt (1, assistant.getAst_id());
	      preparedStmt.setString (2, assistant.getName());
	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		return 1;
	}
	

}
