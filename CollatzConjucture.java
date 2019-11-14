package collatz;

import java.util.ArrayList;
import java.util.Scanner;

public class CollatzConjucture {
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static ArrayList<Integer> colltz(int no) throws IsZeroException {
        ArrayList<Integer> ar = new ArrayList<>();
        if (no == 1)
            ar.add(1);
        else if (no == 0)
            throw new IsZeroException("Input is zero");
        else
            while (no != 1) {
                if (isEven(no)) {
                    no = no / 2;
                    ar.add(no);
                } else {
                    no = 3 * no + 1;
                    ar.add(no);
                }
            }
        return ar;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number:");
            int number = sc.nextInt();
            ArrayList<Integer> res = new ArrayList<>();
            res = colltz(number);
            for (int i : res)
                System.out.print(i + " ");
            int len = res.size();
            System.out.println("\nNo. of elements = " + len);
            int counter = 0;
            int clen = 0;
            while (clen < len) {
                if (counter == number)
                    continue;
                counter++;
                clen = colltz(counter).size();
            }
            System.out.println("Greater  = "+counter);
        } catch (Exception m) {
            System.out.println("Exception occured" + m);
        }
    }
}
