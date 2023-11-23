/*
 	if a sequence of values follows a pattern 
 	of adding a fixed amount from an term to 
 	the next, it is reffered to as an arithmetic
 	sequence.
 	The number added to each term is constant is 
 	called the common difference, d.
 	
 	 eg:  1,4,7,10,13,16,..
 	 
 	 An arithmetic sequence starts with term 'a' 
 	 having common difference 'd' and limit 'n'
 */
package SequenceBased;

import java.util.Scanner;

public class ArithmeticSeries 
{

	public void ArithmeticPro(int n,int d,int a)
	{
		for(int i=1;i<n;i++)
		{
			System.out.print(" "+a);
			a=a+d;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		System.out.println("Enter the diffrence");
		int d=s.nextInt(); 
		System.out.println("Enter the starting");
		int a=s.nextInt(); 
		ArithmeticSeries obj=new ArithmeticSeries();
		obj.ArithmeticPro(n, d,a);
		

	}

}
