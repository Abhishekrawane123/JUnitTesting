package com.bridgelabz;

import java.util.Scanner;

public class SquareRoot 
{
		public static void main(String[] args) throws Exception 
		{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter no to find square root");
				int c = sc.nextInt();
				System.out.println("square root is " + sqrt(c));
				
			} 
			catch (Exception e) 
			{
				System.out.println("enter integer value "+e.getMessage());
			}

		}

		private static String sqrt(int c) {
			// TODO Auto-generated method stub
			return sqrt(c);
		}
	}


