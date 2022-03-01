

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise11
{

    public Exercise11()
    {
    }

    public static void main(String args[])
    {
        int x = 12;
        int y = 8;
        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)
            if(x % i == 0 && y % i == 0)
                gcd = i;

        System.out.printf("GCD of %d and %d is: %d", new Object[] {
            Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(gcd)
        });
    }
}
