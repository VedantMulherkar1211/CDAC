/*The provided code appears to be a Java implementation of the Selection Sort algorithm. 
 * It takes input from the user, sorts the elements using the Selection Sort technique, 
 * and then displays the sorted array.*/

package sortingJava.Selection;

import java.util.Scanner;


public class SelectionSort 
{
Scanner s=new Scanner(System.in);
	
	public void display(int arr[],int size)
	{
		System.out.println("Array:");
		for(int i=0;i<size;i++)
		{
			System.out.print("|"+arr[i]+"|");
		}
	}
	public void selection(int arr[],int size)
	{
		int small,index;
		for(int i=0;i<size;i++)
		{
			small=arr[i];
			index=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<small)
				{
					small=arr[j];
					index=j;
				}
			}
			arr[index]=arr[i];
			arr[i]=small;
		}
		
		display(arr,size);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of elements");
		int size=s.nextInt();
		SelectionSort o=new SelectionSort();
		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		o.display(arr,size);
		System.out.println("\t"+"Selection Sort:");
		o.selection(arr,size);

	}

}
