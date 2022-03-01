// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise17.java

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
