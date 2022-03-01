

package Core_Java_Examples;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercise10
{

    public Exercise10()
    {
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double n1 = in.nextDouble();
        System.out.print("Input second number: ");
        double n2 = in.nextDouble();
        if(n1 % 1.0D == 0.0D && n2 % 1.0D == 0.0D)
            System.out.println("input double variable only");
        System.out.println(n1 > 0.0D && n1 < 1.0D && n2 > 0.0D && n2 < 1.0D);
        in.close();
    }
}
