package se8features;

import java.time.LocalDate;

public class TestDemo1 {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(12, 11, 2017);
		System.out.println(date);
	}
}


/*12 11 2017 will get printed

11 12 2017 will get printed

Compilation error willbe raised as the date component is not range

Exception will get raised as the date component isnot in range
*/
