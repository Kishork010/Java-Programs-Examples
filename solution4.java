package com.codnest.project;

import java.util.Scanner;

public class solution4 
{
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter number : ");
	int n = sc.nextInt();
	Check(n);
	
}

private static void Check(int n) {
	if(n%4==0)
	{
		System.out.print("divisiable by 4 ");
	}
	else
	{
		System.out.println("not divisiable by 4");
	}
}
}
