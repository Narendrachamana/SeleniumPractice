package Day1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateAddFutureDateFunction {

	public static void main(String[] args) {
		
		//Date dt=new Date(new Date().plusDays(20).toDate());
		//Date tomorrow = now().plusDays(1).toDate();
		
		String str = "25-Jun-2020";

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.US);
		Date dt=new Date();
		LocalDate.parse(str, dtf).plusDays(20);
		System.out.println(LocalDate.parse(str, dtf).plusDays(6));
		
	}

}
