

package Core_Java_Examples;

import java.io.*;
import java.util.Scanner;

public class Exercise9
{

    public Exercise9()
    {
    }

    public String findLongestWords()
        throws FileNotFoundException
    {
        String longest_word = "";
        Scanner sc;
        for(sc = new Scanner(new File("abc.txt")); sc.hasNext();)
        {
            String current = sc.next();
            if(current.length() > longest_word.length())
                longest_word = current;
        }

        sc.close();
        return longest_word;
    }

    public static void main(String args[])
    {
        try
        {
            System.out.println((new Exercise9()).findLongestWords());
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
