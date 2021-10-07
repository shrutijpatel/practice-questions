# Print character:
You are given a character ch. You have to print the character ch same as it is.
Note:- Character ch will contain only lowercase English letters.

# Input Format:
The first line of input contains a character ch.

# Output Format:
Print the character ch same as it is.

# Constraints:
a<=ch<=z

# Time Limit:
 0.5 second

# Example:
Sample Input
a

# Sample Output:
a

********************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" ");
    char c = sc.next().charAt(0);
    System.out.println(" "+c);
    }
  }
