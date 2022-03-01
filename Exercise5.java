// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise5.java

package Core_Java_Examples;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.TimeZone;

public class Exercise5
{

    public Exercise5()
    {
    }

    public static void main(String args[])
    {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println((new StringBuilder("Time in New York: ")).append(calNewYork.get(11)).append(":").append(calNewYork.get(12)).append(":").append(calNewYork.get(13)).toString());
        System.out.println();
    }
}
