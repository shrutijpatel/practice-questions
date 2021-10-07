# Print two numbers:
You are given two positive integers N and M. 
You have to print the number N and M separated by a space.

# Input Format:
The first line of input contains two integer N and M.

# Output Format:
Print the numbers N and M separated by a space.

# Constraints:
0<=N, M<=100

# Time Limit:
 0.5 second

# Example:
Sample Input
5 5

# Sample Output:
5 5
****************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[])  {
      Scanner sc = new Scanner(System.in);
      int n, m;
      n = sc.nextInt();
      m = sc.nextInt();
      System.out.println(n + " " + m);
    }
  }
