import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        String st =sc.next();
        int len=st.length();
        int op=0;
        for(int i=0 ; i< len/2 ; i++)
        {
          char ch=st.charAt(i);
          char ch1=st.charAt(len-i-1);
          op = op + Math.abs(ch-ch1);
        }
        System.out.println(op);
      }
    }
  }
