import java.io.*;
import java.util.*;

public class DivisibilityOfTheDifferences {
	public static int[] dx = {-1,0,1,0}, dy = {0,1,0,-1};

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		solve(in, out);
		out.close();
	 }
	 public static void solve(Scanner in, PrintWriter out)
	 {
		 	int n = in.nextInt(), k = in.nextInt(), m = in.nextInt();

		 	int[] div = new int[m];
		 	Arrays.fill(div, 0);
		    int[] div2 = new int[n];

		 	for(int i = 0; i < n; i ++)
		 	{
		 		div2[i] =in.nextInt();
		 	}
		 	for(int i = 0; i < n; i++)
		 	{
		 		int a = div2[i];
		 		div[a%m]++;
		 		if(div[a%m]==k)
		 		{
		 			out.println("Yes");
		 			int count = 0;
		 			for(int j = 0; j < n; j++)
		 			{
		 				if((div2[j]-a)%m==0)
		 				{
		 					out.println(div2[j]);
		 					count++;
		 					if(count==k) break;
		 				}
		 			}
		 			return;
		 		}

		 	}
		 	out.println("No"); return;

	 }

}