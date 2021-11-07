package com.bridgelabz;

import java.util.Scanner;

public class Binary 
{

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Decimal Number to convert into Binary :");
			int decimal = sc.nextInt();
			long x = decimal;
			checkBinary(decimal, x);		
		}
		
		public static void checkBinary(int decimal, long x) 
		{
			int i;
			int [] binary = new int[1000];
			System.out.println("Binary is: ");
			
			for (i = 0; decimal != 0; decimal/=2,i++) 
			{
				binary[i]= decimal % 2;	
			}
			

			for (int j = i-1; j >= 0; j--) 
			{
				System.out.print(binary[j]); 
			}
				
			System.out.println();
			
			
			for(int k = 0; k < binary.length; k++)
			{
				if(binary[k] == 1) 
					System.out.print((int)(Math.pow(2, k))+ " ");
			}
		}

}
