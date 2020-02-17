import java.util.Scanner;
class Node
{
	private int data;
	private Node next;
	Node(int data)
	{
		this.data=data;
	}
	public int getData()
	{
			return data;
	}
	public Node getNext()
	{
			return next;
	}
	public void setNext(Node next)
	{
		this.next=next;
	}
}
public class MyLinkedList
{
	Node head;
	public MyLinkedList()
	{
		head=null;
	}
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head==null)								//to check if list is empty
		{
			head=newNode;
		}
		else
		{
			Node current = head;
			while(current.getNext()!=null)				//to traverse to last node
			{
				current=current.getNext();
			}
			current.setNext(newNode);
		}
		System.out.println("Addition of new node sucessful");
	}
	public void displayList()
	{
		Node current = head;
		if(current==null)
		{
			System.out.println("EMPTY LIST");
		}
		else
		{
			while(current!=null)
			{
				System.out.print(current.getData()+" ");
				current=current.getNext();
			}
		}
	}
	public void inserAtBeginning(Node newNode)
	{
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			head=newNode;
			newNode.setNext(temp);
		}
	}
	public void deleteAtBeginning()
	{
			if(head==null)
			{
				System.out.println("Empty list");
			}
			else
			{
				head=head.getNext();
			}
	}
	public void emptyList()
	{
		head=null;
	}
	public int countno()
	{
		int ctr=0;
		if(head==null)
			return ctr;
		else
		{
			Node current=head;
			while(current!=null)
			{
				ctr++;
				current=current.getNext();
			}
			return ctr;
		}
	}
	public void insertAtEnd(Node newNode)
	{
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			Node current=head;
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(newNode);
		}
	}
	public void inserAtPosition(Node newNode, int pos)
	{
		if(pos==1)
		{
			inserAtBeginning(newNode);
		}
		else if(pos==countno())
		{
			insertAtEnd(newNode);
		}
		else
		{
			Node current=head;
			for(int i=1;i<pos-1;i++)
			{
				current=current.getNext();
			}
			Node temp=current.getNext();
			current.setNext(newNode);
			current=current.getNext();
			current.setNext(temp);
		}
	}
			
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n=sc.nextInt();
		sc.nextLine();
		MyLinkedList ls = new MyLinkedList();
		for(int i=1;i<=n;i++)
		{
			System.out.println("ENTER DATA FOR NODE:");
			ls.addNode(sc.nextInt());
			sc.nextLine();
		}
		int choice=0;
		while(choice==0)
		{
			System.out.println("\n-----------------------------------\nOptions:\nPress 1 for Adding a node\nPress 2 for Insert At Beginning\nPress 3 for Delete At Beginning\nPress 4 for Insert At End\nPress 5 to Empty List\nPress 6 to Display List\nPress 7 to Count number of nodes\nPress 8 to Add At Position\nPress 9 to Exit");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
						System.out.println("Enter data for new node:");
						ls.addNode(sc.nextInt());
						sc.nextLine();
						break;
				case 2:
						System.out.println("Enter data to insert at beginning:");
						Node nbNode=new Node(sc.nextInt());
						ls.inserAtBeginning(nbNode);
						sc.nextLine();
						System.out.println("Insertion Successful");
						break;
				case 3:
						System.out.println("Deletion from Beginning successful");
						ls.deleteAtBeginning();
						System.out.println("\nDeletion Successful");
						break;
				case 4:
						System.out.println("Enter data to insert at end:");
						Node nlNode=new Node(sc.nextInt());
						ls.insertAtEnd(nlNode);
						sc.nextLine();
						System.out.println("\nInsertion Successful");
						break;
				case 5:
						ls.emptyList();
						System.out.println("\nList emptied");
						break;
				case 6:
						System.out.println("\nList:");
						ls.displayList();
						break;
				case 7:
						System.out.println("\nNumer of nodes= "+ls.countno());
						break;
				case 8:
						System.out.println("Enter data");
						Node nnNode=new Node(sc.nextInt());
						sc.nextLine();
						System.out.println("Enter position:");
						int pp=sc.nextInt();
						sc.nextLine();
						ls.inserAtPosition(nnNode, pp);
						System.out.println("\nInsertion Successful");
						break;
				case 9:
						System.out.println("\nExiting!");
						choice=1;
						break;
				default: System.out.println("\nWrong choice!");
			}
		}
			
	}
}
