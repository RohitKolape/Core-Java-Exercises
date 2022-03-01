// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise15.java

package Core_Java_Examples;

import java.io.PrintStream;
import java.util.Scanner;

// Referenced classes of package Core_Java_Examples:
//            Myexception

public class Exercise15
{

    public Exercise15()
    {
    }

    public static void main(String args[])
        throws Myexception
    {
        System.out.print("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();
        if(marks > 100)
            try
            {
                throw new Myexception("Input marks greater than 100 ");
            }
            catch(Myexception ex)
            {
                System.out.println(ex.getMessage());
            }
        else
            System.out.println((new StringBuilder("Marks: ")).append(marks).toString());
    }
}
