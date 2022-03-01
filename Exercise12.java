

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise12
{

    public Exercise12()
    {
    }

    public static void main(String args[])
    {
        int n = 6;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println((new StringBuilder("Fibonacci Series till ")).append(n).append(" terms:").toString());
        for(int i = 1; i <= n; i++)
        {
            System.out.print((new StringBuilder(String.valueOf(firstTerm))).append(", ").toString());
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
