# Second Smallest:
You are given 3 distinct integer numbers X,Y and Z. 
Task is to print the second smallest number among the three provided numbers.

# Input format:
Input contains 3 distinct integers X,Y and Z.

# Output format:
Print the second smallest integer.

# Time Limit:
1 second

# Constraints:
1<=X,Y,Z<=100

# Example:
  Input:
  10 42 15
  Output:
  15
    
******************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
        int x,y,z;
          x=sc.nextInt();
          y=sc.nextInt();
          z=sc.nextInt();
        if(x>y && x<z)
          System.out.println(x);
        if (y>x && y<z)
          System.out.println(y);
        if(z>x && z<y)
          System.out.println(z);        
    }
  }
