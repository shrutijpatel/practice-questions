import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]%2==0)
        {
          System.out.print(a[i]+" ");
        }
      }
      System.out.println();
      for(i=0;i<n;i++)
      {
        if(a[i]%2!=0)
        {
          System.out.print(a[i]+" ");
        }
      }
    }
  }
