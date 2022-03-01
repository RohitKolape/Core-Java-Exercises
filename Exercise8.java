// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise8.java

package Core_Java_Examples;

import java.io.*;

public class Exercise8
{

    public Exercise8()
    {
    }

    public static void main(String args[])
    {
        try
        {
            String data = " Tutorials Point is a best website in the world";
            File f1 = new File("abc.txt");
            if(!f1.exists())
                f1.createNewFile();
            FileWriter fileWritter = new FileWriter(f1.getName(), true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();
            System.out.println("Done");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
