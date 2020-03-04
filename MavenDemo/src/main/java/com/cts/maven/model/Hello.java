package com.cts.maven.model;

public class Hello {
	public int addition(int a,int b) {
		return a+b;
	}
	public boolean check(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Hello obj =new Hello();
		int sum=obj.addition(30,20);
		System.out.println("sum is"  + sum);
		boolean number=obj.check(11);
		System.out.println("number is"  + number);
	}

}
