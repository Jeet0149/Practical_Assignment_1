// Name and id - jeet_21CE149

// Aim :
// Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

import java.util.*;
public class pr6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter array : ");
        for (int i = 0; i < s.length; i++) 
        {
            s[i] = sc.next();
        }

        System.out.println("Enter the chars. wanted to remove : ");
        String ch = sc.next();

        // passing the array and the wanted char. into the method.

        new_removed(s, ch);
        sc.close();
    }
    static void new_removed(String s[], String ch) 
    {
        int count = 0;

        // logic for the removing the char.

        for (int i = 0; i < s.length; i++) 
        {
            if (s[i].equals(ch)) 
            {
                count++;
            }
        }
        String[] f = new String[st.length - count];
        int x = 0;
        for (int i = 0; i < s.length; i++) 
        {
            if (!s[i].equals(ch))
            {
                f[x] = s[i];
                x++;
            }
        }

        System.out.println("New Array with removed char :");
        for (int i=0;i<x;i++) 
        {
            System.out.print(f[i]+" ");
        }
    }
}