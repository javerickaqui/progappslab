import java.util.*;

public class kRounding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int N = n;
		int k = s.nextInt();
		
		int numTwos = 0;
		int numFives = 0;
		while (n % 2 == 0) {
			numTwos++;
			n /= 2;
		}
		while (n % 5 == 0) {
			numFives++;
			n /= 5;
		}
		
		int twoMult = 1; int fiveMult = 1;
		if (k-numTwos > 0) 
			twoMult = (int) Math.pow(2, k-numTwos);
		if (k-numFives > 0) 
			fiveMult = (int) Math.pow(5, k-numFives);		
		long ans = twoMult*(long)fiveMult*(long)N;
		
		System.out.println(ans);
		s.close();
	}

}