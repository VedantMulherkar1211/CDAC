/*
 * Triangular Number Series
 
  The sequence which is generated from a pattern of 
  dots which form a triangle is known as triangular
  Number sequence. 
  
    example: 1 3 6 10 15 21 28 .....
    
    
    if we can see the difference between each sequence 
    it is forming a difference of natural numbers
    
    difference between    1 and 3  = 2
    difference between    3 and 6  = 3
    difference between    6 and 10 = 4
    difference between   10 and 15 = 5
    difference between   15 and 21 = 6
    difference between   21 and 28 = 7
    					
    so to find the difference that is natural number 
    starting from 2 so we know the equation to find 
    the natural number that is  n(n+1)/2 where n is 
    number of terms.
    
    so here our difference is n(n+1)/2 in terms of i 
    ie. i(i+1)/2
 */

package SequenceBased;

import java.util.Scanner;

public class TriangularNumberSeries 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total sequence you want:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print((i*(i+1)/2) + ",");
		}
		System.out.print(".............");

	}
}



/*
 The triangle number series, also known as triangular numbers,
 is a sequence of numbers that can be represented in the form 
 of an equilateral triangle. The nth triangular number is the sum
 of the first n natural numbers.
 
 The formula for the nth triangular number (Tn) is given by:
 
 Tn=1+2+3+...+n=n(n+1)/2
 
 Here how the sequenec starts:
 
 1,3,6,10,15,21,28,36,45,....
 
 Each number in the sequence represents the sum of all natural numbers
 up to that position. For example, the 4th triangular number (T4) is 10,
 which is the sum of 1 + 2 + 3 + 4.
 
 The term "triangle number" comes from the geometric representation.
 If you arrange objects in the shape of an equilateral triangle, the number
 of objects in each layer corresponds to the triangular numbers.
 The first layer has 1 object, the second layer has 2, the third has 3, and so on.
 
 
 */
