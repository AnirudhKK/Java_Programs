package practical2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CarMain {
    public static void main(String []args)
    {
        ArrayList<Car> cars=new ArrayList<Car>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter manufacturer:");
            String man=sc.nextLine();
            System.out.println("Enter price:");
            int p=sc.nextInt();
            sc.nextLine();
            Car obj=new Car(man, p);
            cars.add(obj);
        }
        cars.sort(Comparator.comparing(Car::getPrice));
        for(Car c : cars)
        {
            System.out.print("Manufacturer = "+c.getManufacturer()+" and ");
            System.out.print("Price = "+c.getPrice()+"\n");
        }
        }
    }

