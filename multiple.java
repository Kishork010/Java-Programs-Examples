package com.codnest.project;

import java.util.Scanner;

public class multiple 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number : ");
		int n = sc.nextInt();
		Check(n);
		
	}

	private static void Check(int n) 
	{
		if(n%3==0,n%5==0)
		{
			System.out.print("multiple by 3 ");
		}
		else if(n%5==0)
		{
			System.out.println("multiple by 5");
		}
		else
		{
			System.out.println("the given number is not multiple by 3 and 5");
		}
	}
}
