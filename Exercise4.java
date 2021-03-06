

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
