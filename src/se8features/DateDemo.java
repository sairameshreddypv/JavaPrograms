package se8features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.omg.Messaging.SyncScopeHelper;

public class DateDemo {

	public static void main(String[] args) {
		String date = LocalDate.parse("2016-05-12").format
				(DateTimeFormatter.ISO_DATE_TIME);
	    System.out.println(date);		
	}
}

/*May 12, 2016T00:00.000

Exception in thread "Main"
java.time.temporal.UnsupportedTemporalTypeException

2014-05-04T00:00 00 000

5/4/14T00:00:00*/