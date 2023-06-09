package GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseLibrary {

	Driver driverRef;
	Connection con;

	public void connectToDB() throws SQLException
	{
		driverRef=new Driver();	
		DriverManager.deregisterDriver(driverRef);
		
	}


	public void closeDB() throws SQLException
	{
		con.close();
	}

	public String readDataFromDBAndValidate(String query,int columnIndex,String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next()) 
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("verified");
			return expData;
		}
		else {
			System.out.println("Data not verified");
			return "";
		}
	}
	

}