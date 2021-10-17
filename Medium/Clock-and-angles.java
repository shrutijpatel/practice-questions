# Clock and Angles:
PrepBuddy has an analog clock which consists of two hands one for hour and another for minute. 
She wants to calculate the shorter angle formed between hour and minute hand at any given time.

# Input format:
The first line contains the number of test cases T. 
Each test case contains two integers h and m representing the time in hour and minute format.

# Output format:
For each test case on a new line, print the required shorter angle.

# Constraints:
1<=T<=5
All valid times

# Time Limit:
1 second

# Example:
  Input:
  2
  5 30
  6 00

  Output:
  15
  180
******************************************************************************************

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        int h=sc.nextInt();
        int m=sc.nextInt();
        int hour=(h*360)/12+(m*360)/(12*60);
        int min=(m*360)/60;
        int angle=Math.abs(hour-min);
          if(angle>180)
            angle=360-angle;
            System.out.println(angle);
            t--;
      }
    }
  }
