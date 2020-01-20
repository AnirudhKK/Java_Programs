import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
class Student implements Comparator<Student>
{
	private int roll;
	private String name;
	public void setRoll(int roll){
		this.roll=roll;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString()
	{
		String msg = ("Name = "+name+",  Roll = "+roll);
		return msg;
	}
	@Override	
	public int compare(Student s1, Student s2)
	{
		return s1.getRoll()-s2.getRoll();
	}
	
}
public class NonPrimitiveArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		int l=sc.nextInt();
		sc.nextLine();
		Student arr[]=new Student[l];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter roll no:");
			int roll=sc.nextInt();
			sc.nextLine();
			Student obj=new Student();
			obj.setName(name);
			obj.setRoll(roll);
			arr[i]=obj;
		}
		Arrays.sort(arr, new SortByRoll());
		System.out.println("\n********************************************************\n");
		for(int i=0;i<arr.length;i++) {
				System.out.println("Name = "+arr[i].getName());
				System.out.println("Roll No = "+arr[i].getRoll()+"\n");
			
			/* 	##USING TOSTRING METHOD
				for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			*/
		}
	}
}
			
