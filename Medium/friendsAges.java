import java.util.*;
import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<=n-1;i++)
      {
        a[i]=sc.nextInt();
      }
        int[] count = new int[121];
        for (i=0; i<n;i++) 
		count[a[i]]++;

        int ans = 0;
        for (int ageA = 0; ageA <= 120; ageA++) 
	{
            int countA = count[ageA];
            for (int ageB = 0; ageB <= 120; ageB++) 
	    {
                int countB = count[ageB];
                if (ageA * 0.5 + 7 >= ageB) 
			continue;
                if (ageA < ageB) 
			continue;
                if (ageA < 100 && 100 < ageB) 
			continue;
                ans += countA * countB;
                if (ageA == ageB) 
			ans -= countA;
            }
        }

        System.out.println(ans);
    }
  }
