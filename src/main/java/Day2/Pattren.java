package Day2;

import java.util.Scanner;

public class Pattren {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter how many rows want to print :");
		
		int rows=sc.nextInt();
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
		
		
		
		
	}

}
