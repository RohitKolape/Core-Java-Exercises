// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise14.java

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise14
{

    public Exercise14()
    {
    }

    public static void main(String args[])
    {
        char ch = 'a';
        int ascii = ch;
        System.out.println((new StringBuilder("The ASCII value of ")).append(ch).append(" is: ").append(ascii).toString());
    }
}
