package Java.SingleLinkedList;

public class LinkedNode 
{
	Node head=null;
	public void add(int data)
	{
		Node record=new Node(data);
	
		if(head==null)
		{
			head=record;
		}
		else
		{
			Node move;
		
			for(move=head;move.Link!=null;move=move.Link)
			{
				
			}
			move.Link=record;
		}
	}
	//------------------------------------------------------
	
	public void display()
	{
		Node move;
		for(move=head;move!=null;move=move.Link)
		{
			System.out.println(move.data);
		}
	}
	
}
