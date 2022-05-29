# Operators:
PrepBuddy wants you to get familiar with various Relational operators. 
He provides you with two numerical values X and Y and your task is to find the relation between them that is,
-X is smaller thanY
-X is greater than Y
-X is equal to Y

# Input format:
Two space-separated integers are provided denoted by X and Y.

# Output format:
Print the relation between X and Y.
-X is smaller than Y
-X is greater than Y
-X is equal to Y

# Constraints:
1<=X,Y<=100

# Time Limit:
1 second

# Example:
  Input
  4 6
  Output
  4 is smaller than 6
 


  
***********************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>y){
          System.out.println(""+x+" is greater than "+y+"");
        }
        else if(x<y){
          System.out.println(""+x+" is smaller than "+y+"");
        }
        else{
          System.out.println(""+x+" is equal to "+y+"");
        }
    }
  }
