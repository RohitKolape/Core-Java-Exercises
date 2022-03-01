// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise2.java

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise2
{

    public Exercise2()
    {
    }

    public String reverseString(String str)
    {
        if(str.isEmpty())
            return str;
        else
            return (new StringBuilder(String.valueOf(reverseString(str.substring(1))))).append(str.charAt(0)).toString();
    }

    public static void main(String args[])
    {
        Exercise2 ex = new Exercise2();
        System.out.println(ex.reverseString("JAVATPOINT"));
    }
}
