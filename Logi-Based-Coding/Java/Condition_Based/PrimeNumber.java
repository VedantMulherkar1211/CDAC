/*
 In this we find weather the number is prime numbers or not.
 To find whether the number is prime or not there are two ways:
 Divide the number by the numbers which smaller than it.
 that is if number is 15 then divide it from 2 to 1 4 and count it 
 if count==2 then its prime as a prime number is only divisible by 1 and itself.
 */
package SequenceBased;

import java.util.Scanner;

public class PrimeNumber
{

		public boolean prime(int n)   // n is number
		{
			boolean flag=true;
			int i=2;
			while(i<n)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
				i++;
			}
			return flag;
			
			
		}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		PrimeNumber obj=new PrimeNumber();
		if(obj.prime(num)==true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
