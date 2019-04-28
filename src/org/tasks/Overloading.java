package org.tasks;

public class Overloading {
	public void fun() {
		System.out.println("function");
	}
	public void fun(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Overloading od=new Overloading();
		od.fun();
		od.fun(10, 20);

	}

}
