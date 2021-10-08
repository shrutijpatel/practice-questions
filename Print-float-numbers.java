# Print Float Numbers:
You are given two float numbers N and M. You have to print both numbers N and M separated by a space.
Note:- Print the output till 2 digits after decimal point

#Input Format:
The first line of input contains two float numbers N and M.

# Output Format:
Print both the number N and M separated by a space. 

# Constraints:
1<=N,M<=100

# Time Limit:
 0.5 second

# Example:
 Sample Input
 10.20 2.35
 Sample Output
 10.20 2.35
*****************************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {     
      Scanner sc=new Scanner(System.in);
        float n;
        float m;
        n=sc.nextFloat();
        m=sc.nextFloat();
        System.out.printf("%.2f %.2f" , n , m);
        
    }
  }
