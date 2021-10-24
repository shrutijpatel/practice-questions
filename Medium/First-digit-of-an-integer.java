import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
       while(t != 0)
       {
        int n = sc.nextInt();
        int first = (int)(Math.log10(n));
        n = (int)(n / (int)(Math.pow(10,first)));
        System.out.println(n);
        t--;
        }
    }
 }
