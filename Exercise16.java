// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise16.java

package Core_Java_Examples;

import java.io.PrintStream;

public class Exercise16
{

    public Exercise16()
    {
    }

    public boolean noTriples(int nums[])
    {
        for(int i = 0; i < nums.length - 1; i++)
            if(i + 2 <= nums.length - 1 && nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
                return false;

        return true;
    }

    public static void main(String args[])
    {
        Exercise16 ex = new Exercise16();
        int nums[] = {
            1, 1, 2, 2, 2, 1
        };
        System.out.println(ex.noTriples(nums));
    }
}
