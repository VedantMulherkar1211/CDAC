package Java.SingleLinkedList;

import java.util.Scanner;



public class main {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int ch,data;
		LinkedNode obj2=new LinkedNode();
		do
		{
			System.out.println("Enter your choice:"+"\n"+"1. Insert"+"\n"+"2. Display"+"\n"+"3. Exit");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				{
					for(int i=0;i<5;i++)			// To create only 5 node
					{
						System.out.println("Enter the data");
						data=s.nextInt();
						Node obj1=new Node(data);
						obj2.add(data);
						obj2.display();
					}
					break;
				}
				
				case 2:
				{
					obj2.display();
					break;
				}
				
				case 3:
				{
					break;
				}
			}
		}while(ch!=3);
	}

}
