// Name and id - jeet_21CE149

// Aim : Given a string, return a string made of the
//  first 2 chars (if present), however include
//  first  char  only  if  it  is  'o' and  
//  include  the  second  only  if  it  is  'z', 
//  so  "ozymandias" yields "oz".
//  startOz("ozymandias") → "oz"
//  startOz("bzoo") → "z"
//  startOz("oxx") → "o"

import java.util.Scanner;
class pr2
{
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
      String s = sc.nextLine();
      startOZ(s);
        sc.close();
    }
    static void startOZ(String s)
    {
        // logic for the first letter
      if(s.charAt(0) == 'o' || s.charAt(0) == 'O')
      {
        System.out.print(s.charAt(0));
      }
      // logic for the second letter
      if(s.charAt(1) == 'z' || s.charAt(1) == 'Z')
      {
        System.out.println(s.charAt(1));
      }
    }
}