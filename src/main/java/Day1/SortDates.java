package Day1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortDates {

	public static void main(String[] args) {
			
		ArrayList<String> datestring=new ArrayList<String>();
		datestring.add("26/06/2020 ");
		datestring.add("10/06/2020 ");
		datestring.add("25/06/2020 ");

		/*Collections.sort(datestring, new Comparator<String>() {
		                public int compare(String object1, String object2) {
		                    return object1.compareTo(object2);
		                  
		            }
		            });
		System.out.println(datestring.toString());
	*/
		
		
		Set s=new TreeSet();
		
		for(String i:datestring)
		{
			s.add(i);
		}
		System.out.println(s);
		
		
		
		
		
	}

}
