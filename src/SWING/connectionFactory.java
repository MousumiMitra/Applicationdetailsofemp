/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

/**
 *
 * @author Lenovo
 */
import java.sql.*;
public class connectionFactory {
Connection cn=null;
Statement st=null;
ResultSet rs=null;
public Connection getConn()
{
	try
	{
	  Class.forName("oracle.jdbc.driver.OracleDriver");//Register and load the driver
	  cn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-D49TR7T5:1521:XE","mousumi","mypassword");
	  
	}
	catch(ClassNotFoundException ce)
	{
		ce.printStackTrace();
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	return cn;
}
}
