package org.tasks;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		{
			int i,j;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter row value:");
			int rows=sc.nextInt();
			for(i=rows;i>=1;i--)
			{
				for(j=1;j<=i;j++)
				{
					System.out.println(j+"   ");
				}
				System.out.println();
			}
			
			}
		
		

	}
}


