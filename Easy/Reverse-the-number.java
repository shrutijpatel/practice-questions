# Reverse the number:
Tom gave you a number X and asks you to reverse that number and print it.

# Input format:
One integer is provided denoting the value of X.
Note - The given number doesn't have leading or ending zero's.

# Output format:
Print the reverse of X.

# Constraints:
1<=X<=10^6

# Time Limit:
1 second

# Example:
  Input:
  102345
  Output:
  543201
Note - Do not use any inbuilt function for solving this question.
  
************************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
    int temp,lastdigits=0;
    Scanner in = new Scanner(System.in);
      int x = in.nextInt();
        while(x > 0)
        {
          temp = x % 10;
          lastdigits = lastdigits *10 + temp;
          x = x / 10;

        }
        System.out.println(lastdigits);
    }
  }
