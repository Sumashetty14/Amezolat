package Generic_Utility;

import java.util.Random;

public class GetRandomNo {
	public static int getRandomNo(){
		Random ran = new Random();
		int RandomNo = ran.nextInt(1000);
		return RandomNo;
		
		
		
	}

}
