// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise6.java

package Core_Java_Examples;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercise6
{

    public Exercise6()
    {
    }

    public static int count_Vowels(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;

        return count;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.print((new StringBuilder("Number of  Vowels in the string: ")).append(count_Vowels(str)).append("\n").toString());
        in.close();
    }
}
