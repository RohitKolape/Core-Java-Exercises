
package Core_Java_Examples;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercise13
{

    public Exercise13()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((new StringBuilder("before swapping numbers: ")).append(x).append(" ").append(y).toString());
        x += y;
        y = x - y;
        x -= y;
        System.out.println((new StringBuilder("After swapping: ")).append(x).append("  ").append(y).toString());
        sc.close();
    }
}
