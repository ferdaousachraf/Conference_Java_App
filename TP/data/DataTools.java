package data;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DataTools {
	
	public static int randomIntBetween(int max,int min) {
		
		Random rand = new Random();
		
		return rand.nextInt(max - min + 1) + min ;
	}
	
	
	
	public static Date randomDateBetween(Date startInclusive, Date endExclusive) {
	    long startMillis = startInclusive.getTime();
	    long endMillis = endExclusive.getTime();
	    long randomMillisSinceEpoch = ThreadLocalRandom
	      .current()
	      .nextLong(startMillis, endMillis);

	    return new Date(randomMillisSinceEpoch);
	}

}
