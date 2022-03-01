// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exercise1.java

package Core_Java_Examples;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercise1
{

    public Exercise1()
    {}

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-->");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
        case 97: // 'a'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 101: // 'e'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 105: // 'i'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 111: // 'o'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 117: // 'u'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 65: // 'A'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 69: // 'E'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 73: // 'I'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 79: // 'O'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        case 85: // 'U'
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a vowel").toString());
            break;

        default:
            System.out.println((new StringBuilder(String.valueOf(ch))).append(" is a consonant").toString());
            break;
        }
        sc.close();
    }
}
