# Leap Year or Not:
We all have made fun of our friends who have their birthdays on 29th February.
Given birthday year N of your friend, can you tell her if that is leap year or not? 

# Input format:
The first line constains an integer T denoting the number of test cases.
Each test case contains one integer N.

# Output format:
For each test case on a new line, print Yes if the given year is a leap year else print No.

# Constraints:
1<=T<=10
1<=N<=2500

# Time Limit:
1 second

# Example:
  Input:
  2
  1900
  2012
  Output:
  No
  Yes
  
***********************************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int n[] = new int[t];
        for(int i = 0; i < n.length; i++)
          n[i]= sc.nextInt();
          for(int i = 0; i < n.length; i++)
          {
            if(n[i] % 400 == 0)
            {
              System.out.println("Yes");
            }
            else if(n[i] % 100 == 0)
            {
              System.out.println("No");
            }
            else if(n[i] % 4 == 0)
            {
              System.out.println("Yes");
            }
            else{
              System.out.println("No");
            }
        }
      }
    }
