// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise3.java

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
