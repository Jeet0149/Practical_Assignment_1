// Name and id - jeet_21CE149
// Aim : 
// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true


import java.util.*;
public class pr4 {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            if (arr[i] == 1 && arr[i+1] == 2 && arr[i+2] == 3)
            {
                System.out.println("true");
            }
            sc.close();
        }
    }
}
