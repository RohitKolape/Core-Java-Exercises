

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise3
{

    public Exercise3()
    {
    }

    public static void main(String args[])
    {
        int sum = 0;
        for(int n = 123; n > 0; n /= 10)
        {
            int r = n % 10;
            sum = sum * 10 + r;
        }

        System.out.println((new StringBuilder("reverse:")).append(sum).toString());
    }
}
