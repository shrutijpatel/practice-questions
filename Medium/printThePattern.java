import java.util.*;
  import java.io.*;
  
  public class Main 
  {
    static void fun(int n) //this function is made static so that we can call this function without
    {                                //the object
      System.out.print(n+" ");
      if(n<=0)
      {
        return ;
      }
      fun(n-5);
      System.out.print(n+" ");
    }

    public static void main(String args[]) throws IOException 
    {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        fun(n);
        System.out.println();
      }
    }
  }
