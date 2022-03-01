// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise4.java

package Core_Java_Examples;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;

public class Exercise4
{

    public Exercise4()
    {
    }

    public static void main(String args[])
    {
        LocalDate pdate = LocalDate.of(1997, 11, 12);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pdate, now);
        System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", new Object[] {
            Integer.valueOf(diff.getYears()), Integer.valueOf(diff.getMonths()), Integer.valueOf(diff.getDays())
        });
    }
}
