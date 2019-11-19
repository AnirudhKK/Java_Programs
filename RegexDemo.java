package RegeX;
import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;
public class RegexDemo {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String regex="(\\+91|0)?[6-9]\\d{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(sc.nextLine());
        ArrayList<String> mobile = new ArrayList<>();
        while(m.find())
        {
            String obj = m.group();
            mobile.add(obj);
            System.out.println(obj);
        }
    }
}
