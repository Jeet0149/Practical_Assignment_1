// Name and id - jeet_21CE149

// Aim : 
// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

import java.util.*;
import static java.lang.Math.min;
public class pr5 
{
    //main method
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("string 1 : ");
        String s1 = sc.next();
        System.out.println("string 2 : ");
        String s2 = sc.next();
        int m = match(s1, s2);
        System.out.println(m);
        sc.close();
    }

    public static int match(String s1, String s2) 
    {
        int cnt = 0;
        // finding the minimum length from the string
        int mini = min(s1.length(), s2.length());
        for (int i = 0; i < (mini - 1); i++) 
        {
            String s3 = s1.substring(i, i + 2);
            String s4 = s2.substring(i, i + 2);
            if (p.equals(q)) 
            {
                cnt++;
            }
        }
        return cnt;
    }
}