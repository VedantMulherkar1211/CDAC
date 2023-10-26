package Java.SingleLinkedList;

public class Node 
{
	int data;
	Node Link;
	
	public Node()
	{
		data=1;
		Link=null;
	}
	
	public Node(int data)
	{
		this.data=data;
		this.Link=null;
	}
	
	public int getData() 
	{
		return data;
	}

	public void setData(int data) 
	{
		this.data = data;
	}

	public Node getLink() 
	{
		return Link;
	}

	public void setLink(Node link) 
	{
		Link = link;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", Link=" + Link + "]";
	}
	
	
	
	
}

