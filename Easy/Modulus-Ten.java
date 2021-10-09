# Modulus Ten:
PrepBuddy gave you a number x, and asked you to find the remainder of x divided by 10.

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
1345/10=134 ​with remainder as 5
  
***************************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {    
      int x,y;
      Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=x%10;
        System.out.println(y);
    }
  }
