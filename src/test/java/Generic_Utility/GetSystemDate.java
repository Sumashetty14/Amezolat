package Generic_Utility;

import java.util.Date;

public class GetSystemDate {
	public String getSystemDate()
	{
		Date date = new Date();
		String currentdate = date.toString();
		System.out.println(currentdate);
		String[] arr=currentdate.split("");
		String yyyy=arr[5];
		String dd=arr[2];
		int mm=date.getMonth()+1;
		 String Formate=yyyy+""+mm+""+dd;
		 
		return Formate;
		
	}

}
