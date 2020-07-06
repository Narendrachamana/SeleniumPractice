package Day2;

import java.util.Arrays;

public class RevseStringArray {

	public static void main(String[] args) {
		
		
		String s="Selenium Web driver is open source tool";
		String temp=" ";
		
		String a[]=s.split(" ");
		for(int j=a.length-1;j>=0;j--)
		{
			temp=temp+a[j]+" ";
		}
		System.out.println(temp.toString());
		
		
	}

}
