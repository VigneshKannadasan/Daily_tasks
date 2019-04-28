package org.tasks;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		System.out.println("Enter the value for b");
		int b=sc.nextInt();
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped value of a is:"+a);
		System.out.println("Swapped value of b is:"+b);
	}

}
