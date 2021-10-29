import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int m=sc.nextInt();
        int n=sc.nextInt();
        int res=n*m/2;
        System.out.println(res);
      } 
    }
  }
