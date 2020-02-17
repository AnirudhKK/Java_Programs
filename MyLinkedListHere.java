import java.util.Scanner;
class Student
{
	String name;
	int roll;
	String address;
	public Student(String name, int roll, String address)
	{
		this.name=name;
		this.roll=roll;
		this.address=address;
	}
}
class Node
{
	Student s;
	Node next;
	public Node()
	{
		s=null;
		next=null;
	}
	public Node(Student obj)
	{
		s=obj;
	}
	@Override
	public String toString()
	{
		return "Name = "+s.name+" Roll = "+s.roll+" Address = "+s.address;
	}
}
public class MyLinkedListHere
{
	Node head=null;
	public void insertNode(Node newNode)
	{
		if(head==null)
			head=newNode;
		else
			{
				Node current=head;
				while(current.next!=null)
				{
					current=current.next;
				}
				current.next=newNode;
			}
	}
	public Student deleteNode()
	{
		if(head==null)
		{
			System.out.println("Empty list!");
			return null;
		}
		else
		{
			Node removed=head;
			head=head.next;
			return removed.s;
		}
	}
	public void showList()
	{
		if(head==null)
		{
			System.out.println("Empty list!");
		}
		else
		{
			Node current=head;
			while(current!=null)
			{
				System.out.println(current);
				current=current.next;
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		MyLinkedListHere list=new MyLinkedListHere();
		int continueWant=1;
		while(continueWant==1)
		{
			System.out.println("\n-----------------------------------\nOptions:\nPress 1 for Adding a node\nPress 2 for Deleting\nPress 3 for Looking\nPress 4 for Exiting");
			int option = sc.nextInt();
			sc.nextLine();
			switch(option)
			{
				case 1:
						System.out.println("Enter name of student:");
						String name=sc.nextLine();
						System.out.println("Enter roll number:");
						int roll=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter address:");
						String address=sc.nextLine();
						Student obj=new Student(name,roll,address);
						Node newNodeHere=new Node(obj);
						list.insertNode(newNodeHere);
						System.out.println("Insertion successful");
						break;
				case 2:
						Student removed=list.deleteNode();
						System.out.println("Name = "+removed.name+" Roll = "+removed.roll+" Address = "+removed.address);
						break;
				case 3:
						list.showList();
						break;
				case 4: 
						continueWant=0;
						break;
				default:
							System.out.println("Wrong choice! Try again");
			}
		}
	}
}
	