import java.util.*;
public class RandomArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int size = r.nextInt(50);
		boolean flag;
		int []arr = new int[size];
		do{
			flag = false;
			try{
				for(int i=0;i<arr.length;i++)
				{
					arr[i] = r.nextInt(500);
				}
			}catch (NegativeArraySizeException e){
				size = Math.abs(size);
				flag = true;
			}
		}while(flag);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		System.out.println("Enter index to find:");
		int ind = sc.nextInt();
		if(ind>=size)
			System.out.println("Invalid Index");
		else
			System.out.println(arr[ind]);
	}
}