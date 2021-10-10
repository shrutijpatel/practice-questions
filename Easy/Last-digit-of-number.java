# Last Digit of Number:
Let's solve a problem, which will help you solving many problems going ahead.
Find last digit of a given number x.

# Input format:
A single integer x is provided.

# Output format:
Print a single integer representing the required output.

# Constraints:
1<=x<=2000

# Time Limit:
1 second

# Example:
  Input:
  1345
  Output:
  5

# Sample Test Case Explanation:
The last digit of 1345 is 5.
  
*****************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
      int x,y;
      Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=x%10;
        System.out.print(y);
    }
  }
