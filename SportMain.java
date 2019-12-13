package practical;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class SportMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<Sport> sp = new HashSet<Sport>();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter sport name:");
            String sName = sc.nextLine();
            System.out.println("Enter team size:");
            int sSize=sc.nextInt();
            sc.nextLine();
            Sport obj=new Sport(sName, sSize);
            sp.add(obj);
        }
        System.out.println("Entered details are:");
        for(Sport z : sp)
        {
                System.out.print("Sport name = " + z.getSportName() + " ");
                System.out.print(" and Team Size = " + z.getTeamSize() + "\n");
        }

    }
}
