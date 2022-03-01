

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise17
{

    public Exercise17()
    {
    }

    public static int luckySum(int a, int b, int c)
    {
        if(a == 13)
            return 0;
        if(b == 13)
            return a;
        if(c == 13)
            return a + b;
        else
            return a + b + c;
    }

    public static void main(String args[])
    {
        System.out.println(luckySum(1, 4, 13));
    }
}
