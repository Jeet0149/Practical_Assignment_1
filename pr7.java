// Name and id - jeet_21CE149

// Aim: Display numbers in a pyramid pattern.
//                  1
//                1 2 1
//              1 2 4 2 1
//            1 2 4 8 4 2 1
//          1 2 4 8 16 8 4 2 1
//       1 2 4 8 16 32 16 8 4 2 1
//    1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1

import java.util.*;
public class pr7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = " ";

        // entering the value for how many rows we want to print 
        System.out.println("Enter the value : ");
        int no = sc.nextInt();

        //number for counting 
        int number = 0;
        for (int row = 0; row <= no-1; row++) 
        {  
            for (int column = 0; column <= no-1 - row; column++) 
            {
                System.out.printf("%4s", str);
            } 
            for (int column = 0; column <= row; column++) 
            {
                number = (int) Math.pow(2, col);
                System.out.printf("%4d", number);
            }
            
            for (int column = row - 1; column >= 0; column--) 
            {
                number = (int) Math.pow(2, col);
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
        sc.close();
    }
}