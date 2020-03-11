package se8features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatting {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 11, 13);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy",Locale.UK);
		System.out.println(formatter);

	}
	
}

// execution willnot be successfull as the month is not in a valid range
// compilation will not be successfull as the month is not in a valid range
// 13/NOV/2016 will be printed
// 13/NOV/2016 will be printed
