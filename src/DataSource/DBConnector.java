/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataSource;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anders Kjær
 */
public class DBConnector {

	  private static String id = "cphak160";				
	  private static String pw = "cphak160";
	 
	  public Connection getConnection()
	  {
	    Connection con = null;
	    try 
	    {  
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      con = DriverManager.getConnection(
	          "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat", id,  pw );  
	    }
	    catch (Exception e) 
	    {   
	    	System.out.println("\n*** Remember to insert your Oracle ID and PW in the DBConnector class! ***\n");
	    	System.out.println("eror in DBConnector.getConnection()");
	        System.out.println(e); 	     
	    }    

	    return con;
	  }
	  
	  public void releaseConnection(Connection con)
	  {
	      try{
	          con.close();
	      }
	      catch (Exception e)
	      { System.err.println(e);}
	  }
}