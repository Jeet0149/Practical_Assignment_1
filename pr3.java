// Name and id - jeet_21CE149

// Aim : 
// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true

import java.util.*;
public class pr3 {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r=a%10 , s=b%10;
        // comparing the last digit
        if(r == s)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}
