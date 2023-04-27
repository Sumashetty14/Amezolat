package GenericUtility;

import java.util.Random;

public class JavaUtility {
	/*
	  This method is used to provide duplicate value 
	 */
		public int getrandomnum()
		{
		Random ran = new Random();
		int rannum = ran.nextInt(1000);
		return rannum;
		}
	}
	


